# Drawing a dendrogram image for the single-linkage clustering merges
import matplotlib.pyplot as plt

# Leaves positions (x) and labels
labels = ["A","B","C","D","F","E"]
x_pos = {label: i for i,label in enumerate(labels)}

# Merge sequence with heights and cluster members (we'll use positions)
# Merges:
# 1. A + B -> 0.12
# 2. C + D -> 0.14
# 3. (AB) + (CD) -> 0.16
# 4. (ABCD) + F -> 0.20
# 5. (ABCDF) + E -> 0.28

# We'll track cluster positions and heights
clusters = {label: {'x': x_pos[label], 'height': 0.0} for label in labels}
merges = [
    (["A","B"], 0.12),
    (["C","D"], 0.14),
    (["A","B","C","D"], 0.16),
    (["A","B","C","D","F"], 0.20),
    (["A","B","C","D","F","E"], 0.28)
]

fig, ax = plt.subplots(figsize=(8,5))

def get_cluster_x(cluster_members):
    # x coordinate is average of member x positions
    xs = [clusters[m]['x'] for m in cluster_members]
    return sum(xs)/len(xs)

for members, height in merges:
    # find the two subclusters being merged: split members into two groups
    # We'll find subsets that already exist and merge them
    # To do so, find existing clusters whose member sets are subset of members
    existing = []
    for k,v in list(clusters.items()):
        # find original label or multi-label (we store joined labels as key)
        # determine if cluster's member labels are subset of 'members' by checking label in members or if key contains ','
        pass

# Instead of complex subset logic, we'll hardcode the pairs based on the known sequence:
pairs = [
    (["A"], ["B"], 0.12),
    (["C"], ["D"], 0.14),
    (["A","B"], ["C","D"], 0.16),
    (["A","B","C","D"], ["F"], 0.20),
    (["A","B","C","D","F"], ["E"], 0.28)
]

for left, right, h in pairs:
    # compute x positions
    left_x = sum(clusters[m]['x'] for m in left)/len(left)
    right_x = sum(clusters[m]['x'] for m in right)/len(right)
    # vertical lines for left cluster up to height h
    ax.plot([left_x, left_x], [clusters[left[0]]['height'], h], linewidth=1)
    # vertical lines for right cluster up to height h
    ax.plot([right_x, right_x], [clusters[right[0]]['height'], h], linewidth=1)
    # horizontal line connecting them at height h
    ax.plot([left_x, right_x], [h, h], linewidth=1)
    # new cluster x and height
    new_x = (left_x + right_x)/2
    new_key = ",".join(left+right)
    clusters[new_key] = {'x': new_x, 'height': h}
    # For plotting subsequent verticals, set representative height for members to h
    for m in left+right:
        clusters[m]['height'] = h
        clusters[m]['x'] = clusters[m]['x']  # unchanged

# Draw leaf labels and small stems
for label, x in x_pos.items():
    stem_height = 0.0
    ax.plot([x, x], [stem_height, clusters[label]['height']], linewidth=1)
    ax.text(x, -0.02, label, ha='center', va='top')

# Set limits and labels
ax.set_ylim(-0.05, 0.32)
ax.set_xlim(-0.5, 5.5)
ax.set_ylabel("Distance")
ax.set_xticks([])
ax.set_title("Single-linkage Dendrogram")
plt.tight_layout()
# Save image
img_path = "/mnt/data/dendrogram_single_linkage.png"
plt.savefig(img_path, dpi=150)
plt.show()

print(f"Image saved to: {img_path}")

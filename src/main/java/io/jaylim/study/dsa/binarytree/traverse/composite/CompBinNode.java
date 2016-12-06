package io.jaylim.study.dsa.binarytree.traverse.composite;

public interface CompBinNode {
  public boolean isLeaf();

  public void preorder();

  public void postorder();

  public void inorder();
}

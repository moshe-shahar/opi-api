// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme_pcie.proto

package opi_api.storage.v1;

public interface NvmeNamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.NvmeNamespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 1;</code>
   * @return The spec.
   */
  opi_api.storage.v1.NvmeNamespaceSpec getSpec();
  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceSpec spec = 1;</code>
   */
  opi_api.storage.v1.NvmeNamespaceSpecOrBuilder getSpecOrBuilder();

  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 2;</code>
   * @return The status.
   */
  opi_api.storage.v1.NvmeNamespaceStatus getStatus();
  /**
   * <code>.opi_api.storage.v1.NvmeNamespaceStatus status = 2;</code>
   */
  opi_api.storage.v1.NvmeNamespaceStatusOrBuilder getStatusOrBuilder();
}

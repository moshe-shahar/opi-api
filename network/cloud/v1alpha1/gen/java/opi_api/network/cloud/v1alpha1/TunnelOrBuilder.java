// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tunnel.proto

package opi_api.network.cloud.v1alpha1;

public interface TunnelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.Tunnel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelSpec spec = 3;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelSpec spec = 3;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.TunnelSpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelSpec spec = 3;</code>
   */
  opi_api.network.cloud.v1alpha1.TunnelSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * operational status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelStatus status = 4;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * operational status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelStatus status = 4;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.TunnelStatus getStatus();
  /**
   * <pre>
   * operational status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.TunnelStatus status = 4;</code>
   */
  opi_api.network.cloud.v1alpha1.TunnelStatusOrBuilder getStatusOrBuilder();
}

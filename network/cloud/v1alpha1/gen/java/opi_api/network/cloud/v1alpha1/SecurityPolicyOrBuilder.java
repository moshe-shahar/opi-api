// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicySpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicySpec spec = 1;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicySpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicySpec spec = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicySpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyStatus status = 2;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicyStatus getStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityPolicyStatus status = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityPolicyStatusOrBuilder getStatusOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networkpolicy.proto

package opi_api.network.cloud.v1alpha1;

public interface SecurityRuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.SecurityRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleSpec spec = 1;</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleSpec spec = 1;</code>
   * @return The spec.
   */
  opi_api.network.cloud.v1alpha1.SecurityRuleSpec getSpec();
  /**
   * <pre>
   * configuration
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleSpec spec = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityRuleSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleStatus status = 2;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleStatus status = 2;</code>
   * @return The status.
   */
  opi_api.network.cloud.v1alpha1.SecurityRuleStatus getStatus();
  /**
   * <pre>
   * status
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.SecurityRuleStatus status = 2;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityRuleStatusOrBuilder getStatusOrBuilder();
}

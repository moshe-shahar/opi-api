// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface SviOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.Svi)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the Svi.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: svis/{svi}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the Svi.
   * "name" is an opaque object handle that is not user settable.
   * "name" will be returned with created object
   * user can only set {resource}_id on the Create request object
   * Format: svis/{svi}
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Svi's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <pre>
   * Svi's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The spec.
   */
  opi_api.network.evpn_gw.v1alpha1.SviSpec getSpec();
  /**
   * <pre>
   * Svi's network configuration
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviSpec spec = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.evpn_gw.v1alpha1.SviSpecOrBuilder getSpecOrBuilder();

  /**
   * <pre>
   * Svi's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviStatus status = 3;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Svi's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviStatus status = 3;</code>
   * @return The status.
   */
  opi_api.network.evpn_gw.v1alpha1.SviStatus getStatus();
  /**
   * <pre>
   * Svi's network status
   * </pre>
   *
   * <code>.opi_api.network.evpn_gw.v1alpha1.SviStatus status = 3;</code>
   */
  opi_api.network.evpn_gw.v1alpha1.SviStatusOrBuilder getStatusOrBuilder();
}
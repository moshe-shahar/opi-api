// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: l3_xpu_infra_mgr.proto

package opi_api.network.evpn_gw.v1alpha1;

public interface SviSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.evpn_gw.v1alpha1.SviSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Vrf name
   * Format is `vrfs/{vrf}`
   * </pre>
   *
   * <code>string vrf = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The vrf.
   */
  java.lang.String getVrf();
  /**
   * <pre>
   *Vrf name
   * Format is `vrfs/{vrf}`
   * </pre>
   *
   * <code>string vrf = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for vrf.
   */
  com.google.protobuf.ByteString
      getVrfBytes();

  /**
   * <pre>
   * Logical Bridge name
   * Format is `logicalBridges/{logical_bridge}`
   * </pre>
   *
   * <code>string logical_bridge = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The logicalBridge.
   */
  java.lang.String getLogicalBridge();
  /**
   * <pre>
   * Logical Bridge name
   * Format is `logicalBridges/{logical_bridge}`
   * </pre>
   *
   * <code>string logical_bridge = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for logicalBridge.
   */
  com.google.protobuf.ByteString
      getLogicalBridgeBytes();

  /**
   * <pre>
   * Svi's MAC address.
   * </pre>
   *
   * <code>bytes mac_address = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The macAddress.
   */
  com.google.protobuf.ByteString getMacAddress();

  /**
   * <pre>
   * The GW IP addresses assigned to the SVI
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPPrefix gw_ip_prefix = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<opi_api.network.opinetcommon.v1alpha1.IPPrefix> 
      getGwIpPrefixList();
  /**
   * <pre>
   * The GW IP addresses assigned to the SVI
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPPrefix gw_ip_prefix = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefix getGwIpPrefix(int index);
  /**
   * <pre>
   * The GW IP addresses assigned to the SVI
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPPrefix gw_ip_prefix = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getGwIpPrefixCount();
  /**
   * <pre>
   * The GW IP addresses assigned to the SVI
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPPrefix gw_ip_prefix = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder> 
      getGwIpPrefixOrBuilderList();
  /**
   * <pre>
   * The GW IP addresses assigned to the SVI
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.IPPrefix gw_ip_prefix = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPPrefixOrBuilder getGwIpPrefixOrBuilder(
      int index);

  /**
   * <pre>
   * Set to true to enable BGP peering with Vrf on Svi
   * </pre>
   *
   * <code>bool enable_bgp = 5;</code>
   * @return The enableBgp.
   */
  boolean getEnableBgp();

  /**
   * <pre>
   * Conditional: The remote AS used by BGP speakers on LB (1-65535)
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: remote_as cannot be negative number. --)
   * </pre>
   *
   * <code>uint32 remote_as = 6;</code>
   * @return The remoteAs.
   */
  int getRemoteAs();
}
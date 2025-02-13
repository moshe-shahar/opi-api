// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bgp.proto

package opi_api.network.cloud.v1alpha1;

public interface BGPPeerSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.BGPPeerSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique key/identifier of peer
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * unique key/identifier of peer
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  opi_api.common.v1.ObjectKey getId();
  /**
   * <pre>
   * unique key/identifier of peer
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * peer enable/disable admin state. if peer is not enabled then local router
   * must not initiate connections to the neighbor and must not respond to
   * TCP connections attempts from neighbor
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * peer enable/disable admin state. if peer is not enabled then local router
   * must not initiate connections to the neighbor and must not respond to
   * TCP connections attempts from neighbor
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.AdminState state = 2;</code>
   * @return The state.
   */
  opi_api.network.opinetcommon.v1alpha1.AdminState getState();

  /**
   * <pre>
   * BGP local IP address. control plane chooses the local IP address of the
   * session if an all 0 IP address is provided
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress local_address = 3;</code>
   * @return Whether the localAddress field is set.
   */
  boolean hasLocalAddress();
  /**
   * <pre>
   * BGP local IP address. control plane chooses the local IP address of the
   * session if an all 0 IP address is provided
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress local_address = 3;</code>
   * @return The localAddress.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getLocalAddress();
  /**
   * <pre>
   * BGP local IP address. control plane chooses the local IP address of the
   * session if an all 0 IP address is provided
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress local_address = 3;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getLocalAddressOrBuilder();

  /**
   * <pre>
   * BGP peer IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress peer_addr = 4;</code>
   * @return Whether the peerAddr field is set.
   */
  boolean hasPeerAddr();
  /**
   * <pre>
   * BGP peer IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress peer_addr = 4;</code>
   * @return The peerAddr.
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddress getPeerAddr();
  /**
   * <pre>
   * BGP peer IP address
   * </pre>
   *
   * <code>.opi_api.network.opinetcommon.v1alpha1.IPAddress peer_addr = 4;</code>
   */
  opi_api.network.opinetcommon.v1alpha1.IPAddressOrBuilder getPeerAddrOrBuilder();

  /**
   * <pre>
   * remote 4-byte AS number
   * (-- api-linter: core::0141::forbidden-types=disabled
   *     aip.dev/not-precedent: must use uint32 per BGP spec. --)
   * </pre>
   *
   * <code>uint32 remote_asn = 5;</code>
   * @return The remoteAsn.
   */
  int getRemoteAsn();

  /**
   * <pre>
   * send regular community attributes to neighbor
   * </pre>
   *
   * <code>bool send_comm = 6;</code>
   * @return The sendComm.
   */
  boolean getSendComm();

  /**
   * <pre>
   * send extended community attributes to neighbor
   * </pre>
   *
   * <code>bool send_ext_comm = 7;</code>
   * @return The sendExtComm.
   */
  boolean getSendExtComm();

  /**
   * <pre>
   * peer is a route reflector client
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient rr_client = 8;</code>
   * @return The enum numeric value on the wire for rrClient.
   */
  int getRrClientValue();
  /**
   * <pre>
   * peer is a route reflector client
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.BGPPeerRRClient rr_client = 8;</code>
   * @return The rrClient.
   */
  opi_api.network.cloud.v1alpha1.BGPPeerRRClient getRrClient();

  /**
   * <pre>
   * BGP session connect-retry timer in seconds
   * </pre>
   *
   * <code>int32 connect_retry = 9;</code>
   * @return The connectRetry.
   */
  int getConnectRetry();

  /**
   * <pre>
   * BGP session configured holdtime timer in seconds
   * </pre>
   *
   * <code>int32 holdtime = 10;</code>
   * @return The holdtime.
   */
  int getHoldtime();

  /**
   * <pre>
   * BGP session configured keepalive timer in seconds
   * </pre>
   *
   * <code>int32 keep_alive = 11;</code>
   * @return The keepAlive.
   */
  int getKeepAlive();

  /**
   * <pre>
   * MD5 authentication
   * </pre>
   *
   * <code>bytes password = 12;</code>
   * @return The password.
   */
  com.google.protobuf.ByteString getPassword();

  /**
   * <pre>
   * TTL, set 1 to enable fast-external-fallover for directly connected eBGP sessions
   * range:1-255, default 64
   * (-- api-linter: core::0214::ttl-type=disabled
   *     aip.dev/not-precedent: ttl is not a duration. --)
   * </pre>
   *
   * <code>int32 ttl = 13;</code>
   * @return The ttl.
   */
  int getTtl();

  /**
   * <pre>
   * IdleHoldTime in seconds, range:1-32767, default 15
   * </pre>
   *
   * <code>int32 idle_holdtime = 14;</code>
   * @return The idleHoldtime.
   */
  int getIdleHoldtime();

  /**
   * <pre>
   * The number of instances of the local AS identifier that may be contained in the route's
   * AS-Path without rejecting the route. Changing the value of this object while the peer
   * is active triggers BGP to refresh its routes from the peer
   * range:0-255, default 0
   * </pre>
   *
   * <code>int32 allow_local_as = 15;</code>
   * @return The allowLocalAs.
   */
  int getAllowLocalAs();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: port.proto

package opi_api.network.cloud.v1alpha1;

public interface PortLinkStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.PortLinkStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * operational state of port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortOperState oper_state = 1;</code>
   * @return The enum numeric value on the wire for operState.
   */
  int getOperStateValue();
  /**
   * <pre>
   * operational state of port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortOperState oper_state = 1;</code>
   * @return The operState.
   */
  opi_api.network.cloud.v1alpha1.PortOperState getOperState();

  /**
   * <pre>
   * operational speed of the port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortSpeed port_speed = 2;</code>
   * @return The enum numeric value on the wire for portSpeed.
   */
  int getPortSpeedValue();
  /**
   * <pre>
   * operational speed of the port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortSpeed port_speed = 2;</code>
   * @return The portSpeed.
   */
  opi_api.network.cloud.v1alpha1.PortSpeed getPortSpeed();

  /**
   * <pre>
   * operational state of AN
   * </pre>
   *
   * <code>bool autoneg_en = 3;</code>
   * @return The autonegEn.
   */
  boolean getAutonegEn();

  /**
   * <pre>
   * operational value of NumLanes
   * </pre>
   *
   * <code>int32 lanes_count = 4;</code>
   * @return The lanesCount.
   */
  int getLanesCount();

  /**
   * <pre>
   * operational fec type of port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortFecType fec_type = 5;</code>
   * @return The enum numeric value on the wire for fecType.
   */
  int getFecTypeValue();
  /**
   * <pre>
   * operational fec type of port
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.PortFecType fec_type = 5;</code>
   * @return The fecType.
   */
  opi_api.network.cloud.v1alpha1.PortFecType getFecType();
}

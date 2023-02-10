// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

/**
 * <pre>
 * IP address families
 * </pre>
 *
 * Protobuf enum {@code opi_api.network.opinetcommon.v1alpha1.IpAf}
 */
public enum IpAf
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>IP_AF_UNSPECIFIED = 0;</code>
   */
  IP_AF_UNSPECIFIED(0),
  /**
   * <pre>
   * ipv4
   * </pre>
   *
   * <code>IP_AF_INET = 1;</code>
   */
  IP_AF_INET(1),
  /**
   * <pre>
   * ipv6
   * </pre>
   *
   * <code>IP_AF_INET6 = 2;</code>
   */
  IP_AF_INET6(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * unspecified
   * </pre>
   *
   * <code>IP_AF_UNSPECIFIED = 0;</code>
   */
  public static final int IP_AF_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * ipv4
   * </pre>
   *
   * <code>IP_AF_INET = 1;</code>
   */
  public static final int IP_AF_INET_VALUE = 1;
  /**
   * <pre>
   * ipv6
   * </pre>
   *
   * <code>IP_AF_INET6 = 2;</code>
   */
  public static final int IP_AF_INET6_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static IpAf valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static IpAf forNumber(int value) {
    switch (value) {
      case 0: return IP_AF_UNSPECIFIED;
      case 1: return IP_AF_INET;
      case 2: return IP_AF_INET6;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IpAf>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IpAf> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IpAf>() {
          public IpAf findValueByNumber(int number) {
            return IpAf.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final IpAf[] VALUES = values();

  public static IpAf valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private IpAf(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opi_api.network.opinetcommon.v1alpha1.IpAf)
}

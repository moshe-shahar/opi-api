// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

public interface ListSecurityProfilesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.network.cloud.v1alpha1.ListSecurityProfilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * list of securityprofiles
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  java.util.List<opi_api.network.cloud.v1alpha1.SecurityProfile> 
      getSecurityprofileList();
  /**
   * <pre>
   * list of securityprofiles
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityProfile getSecurityprofile(int index);
  /**
   * <pre>
   * list of securityprofiles
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  int getSecurityprofileCount();
  /**
   * <pre>
   * list of securityprofiles
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  java.util.List<? extends opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder> 
      getSecurityprofileOrBuilderList();
  /**
   * <pre>
   * list of securityprofiles
   * </pre>
   *
   * <code>repeated .opi_api.network.cloud.v1alpha1.SecurityProfile securityprofile = 1;</code>
   */
  opi_api.network.cloud.v1alpha1.SecurityProfileOrBuilder getSecurityprofileOrBuilder(
      int index);

  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * next page token
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}

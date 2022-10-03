// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: oc_interfaces.proto

#include "oc_interfaces.pb.h"
#include "oc_interfaces.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace opi_api {
namespace network {
namespace v1 {

static const char* NetInterface_method_names[] = {
  "/opi_api.network.v1.NetInterface/NetInterfaceGet",
  "/opi_api.network.v1.NetInterface/NetInterfaceList",
  "/opi_api.network.v1.NetInterface/NetInterfaceUpdate",
};

std::unique_ptr< NetInterface::Stub> NetInterface::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< NetInterface::Stub> stub(new NetInterface::Stub(channel, options));
  return stub;
}

NetInterface::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_NetInterfaceGet_(NetInterface_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NetInterfaceList_(NetInterface_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_NetInterfaceUpdate_(NetInterface_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status NetInterface::Stub::NetInterfaceGet(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest& request, ::opi_api::network::v1::NetInterfaceGetResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::network::v1::NetInterfaceGetRequest, ::opi_api::network::v1::NetInterfaceGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NetInterfaceGet_, context, request, response);
}

void NetInterface::Stub::async::NetInterfaceGet(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest* request, ::opi_api::network::v1::NetInterfaceGetResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::network::v1::NetInterfaceGetRequest, ::opi_api::network::v1::NetInterfaceGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceGet_, context, request, response, std::move(f));
}

void NetInterface::Stub::async::NetInterfaceGet(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest* request, ::opi_api::network::v1::NetInterfaceGetResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceGet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceGetResponse>* NetInterface::Stub::PrepareAsyncNetInterfaceGetRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::network::v1::NetInterfaceGetResponse, ::opi_api::network::v1::NetInterfaceGetRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NetInterfaceGet_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceGetResponse>* NetInterface::Stub::AsyncNetInterfaceGetRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNetInterfaceGetRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NetInterface::Stub::NetInterfaceList(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceListRequest& request, ::opi_api::network::v1::NetInterfaceListResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::network::v1::NetInterfaceListRequest, ::opi_api::network::v1::NetInterfaceListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NetInterfaceList_, context, request, response);
}

void NetInterface::Stub::async::NetInterfaceList(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceListRequest* request, ::opi_api::network::v1::NetInterfaceListResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::network::v1::NetInterfaceListRequest, ::opi_api::network::v1::NetInterfaceListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceList_, context, request, response, std::move(f));
}

void NetInterface::Stub::async::NetInterfaceList(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceListRequest* request, ::opi_api::network::v1::NetInterfaceListResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceList_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceListResponse>* NetInterface::Stub::PrepareAsyncNetInterfaceListRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceListRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::network::v1::NetInterfaceListResponse, ::opi_api::network::v1::NetInterfaceListRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NetInterfaceList_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceListResponse>* NetInterface::Stub::AsyncNetInterfaceListRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceListRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNetInterfaceListRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status NetInterface::Stub::NetInterfaceUpdate(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest& request, ::opi_api::network::v1::NetInterfaceUpdateResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::network::v1::NetInterfaceUpdateRequest, ::opi_api::network::v1::NetInterfaceUpdateResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_NetInterfaceUpdate_, context, request, response);
}

void NetInterface::Stub::async::NetInterfaceUpdate(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest* request, ::opi_api::network::v1::NetInterfaceUpdateResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::network::v1::NetInterfaceUpdateRequest, ::opi_api::network::v1::NetInterfaceUpdateResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceUpdate_, context, request, response, std::move(f));
}

void NetInterface::Stub::async::NetInterfaceUpdate(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest* request, ::opi_api::network::v1::NetInterfaceUpdateResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_NetInterfaceUpdate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceUpdateResponse>* NetInterface::Stub::PrepareAsyncNetInterfaceUpdateRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::network::v1::NetInterfaceUpdateResponse, ::opi_api::network::v1::NetInterfaceUpdateRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_NetInterfaceUpdate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::network::v1::NetInterfaceUpdateResponse>* NetInterface::Stub::AsyncNetInterfaceUpdateRaw(::grpc::ClientContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncNetInterfaceUpdateRaw(context, request, cq);
  result->StartCall();
  return result;
}

NetInterface::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NetInterface_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NetInterface::Service, ::opi_api::network::v1::NetInterfaceGetRequest, ::opi_api::network::v1::NetInterfaceGetResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NetInterface::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::network::v1::NetInterfaceGetRequest* req,
             ::opi_api::network::v1::NetInterfaceGetResponse* resp) {
               return service->NetInterfaceGet(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NetInterface_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NetInterface::Service, ::opi_api::network::v1::NetInterfaceListRequest, ::opi_api::network::v1::NetInterfaceListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NetInterface::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::network::v1::NetInterfaceListRequest* req,
             ::opi_api::network::v1::NetInterfaceListResponse* resp) {
               return service->NetInterfaceList(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      NetInterface_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< NetInterface::Service, ::opi_api::network::v1::NetInterfaceUpdateRequest, ::opi_api::network::v1::NetInterfaceUpdateResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](NetInterface::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::network::v1::NetInterfaceUpdateRequest* req,
             ::opi_api::network::v1::NetInterfaceUpdateResponse* resp) {
               return service->NetInterfaceUpdate(ctx, req, resp);
             }, this)));
}

NetInterface::Service::~Service() {
}

::grpc::Status NetInterface::Service::NetInterfaceGet(::grpc::ServerContext* context, const ::opi_api::network::v1::NetInterfaceGetRequest* request, ::opi_api::network::v1::NetInterfaceGetResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NetInterface::Service::NetInterfaceList(::grpc::ServerContext* context, const ::opi_api::network::v1::NetInterfaceListRequest* request, ::opi_api::network::v1::NetInterfaceListResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status NetInterface::Service::NetInterfaceUpdate(::grpc::ServerContext* context, const ::opi_api::network::v1::NetInterfaceUpdateRequest* request, ::opi_api::network::v1::NetInterfaceUpdateResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace network
}  // namespace v1

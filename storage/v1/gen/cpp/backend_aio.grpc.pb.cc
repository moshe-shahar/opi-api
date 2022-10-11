// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: backend_aio.proto

#include "backend_aio.pb.h"
#include "backend_aio.grpc.pb.h"

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
namespace storage {
namespace v1 {

static const char* AioControllerService_method_names[] = {
  "/opi_api.storage.v1.AioControllerService/AioControllerCreate",
  "/opi_api.storage.v1.AioControllerService/AioControllerDelete",
  "/opi_api.storage.v1.AioControllerService/AioControllerGet",
  "/opi_api.storage.v1.AioControllerService/AioControllerGetList",
  "/opi_api.storage.v1.AioControllerService/AioControllerGetStats",
  "/opi_api.storage.v1.AioControllerService/AioControllerUpdate",
};

std::unique_ptr< AioControllerService::Stub> AioControllerService::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< AioControllerService::Stub> stub(new AioControllerService::Stub(channel, options));
  return stub;
}

AioControllerService::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_AioControllerCreate_(AioControllerService_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AioControllerDelete_(AioControllerService_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AioControllerGet_(AioControllerService_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AioControllerGetList_(AioControllerService_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AioControllerGetStats_(AioControllerService_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_AioControllerUpdate_(AioControllerService_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status AioControllerService::Stub::AioControllerCreate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest& request, ::opi_api::storage::v1::AioController* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerCreateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerCreate_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerCreate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest* request, ::opi_api::storage::v1::AioController* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerCreateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerCreate_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerCreate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest* request, ::opi_api::storage::v1::AioController* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerCreate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::PrepareAsyncAioControllerCreateRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::AioController, ::opi_api::storage::v1::AioControllerCreateRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerCreate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::AsyncAioControllerCreateRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerCreateRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status AioControllerService::Stub::AioControllerDelete(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest& request, ::google::protobuf::Empty* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerDeleteRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerDelete_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerDelete(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest* request, ::google::protobuf::Empty* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerDeleteRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerDelete_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerDelete(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest* request, ::google::protobuf::Empty* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerDelete_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* AioControllerService::Stub::PrepareAsyncAioControllerDeleteRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::google::protobuf::Empty, ::opi_api::storage::v1::AioControllerDeleteRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerDelete_, context, request);
}

::grpc::ClientAsyncResponseReader< ::google::protobuf::Empty>* AioControllerService::Stub::AsyncAioControllerDeleteRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerDeleteRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status AioControllerService::Stub::AioControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetRequest& request, ::opi_api::storage::v1::AioController* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerGetRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerGet_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetRequest* request, ::opi_api::storage::v1::AioController* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerGetRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGet_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerGet(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetRequest* request, ::opi_api::storage::v1::AioController* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGet_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::PrepareAsyncAioControllerGetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::AioController, ::opi_api::storage::v1::AioControllerGetRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerGet_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::AsyncAioControllerGetRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerGetRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status AioControllerService::Stub::AioControllerGetList(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest& request, ::opi_api::storage::v1::AioControllerList* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerGetListRequest, ::opi_api::storage::v1::AioControllerList, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerGetList_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerGetList(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest* request, ::opi_api::storage::v1::AioControllerList* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerGetListRequest, ::opi_api::storage::v1::AioControllerList, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGetList_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerGetList(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest* request, ::opi_api::storage::v1::AioControllerList* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGetList_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioControllerList>* AioControllerService::Stub::PrepareAsyncAioControllerGetListRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::AioControllerList, ::opi_api::storage::v1::AioControllerGetListRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerGetList_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioControllerList>* AioControllerService::Stub::AsyncAioControllerGetListRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerGetListRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status AioControllerService::Stub::AioControllerGetStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest& request, ::opi_api::storage::v1::AioControllerStats* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerGetStatsRequest, ::opi_api::storage::v1::AioControllerStats, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerGetStats_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerGetStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest* request, ::opi_api::storage::v1::AioControllerStats* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerGetStatsRequest, ::opi_api::storage::v1::AioControllerStats, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGetStats_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerGetStats(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest* request, ::opi_api::storage::v1::AioControllerStats* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerGetStats_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioControllerStats>* AioControllerService::Stub::PrepareAsyncAioControllerGetStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::AioControllerStats, ::opi_api::storage::v1::AioControllerGetStatsRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerGetStats_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioControllerStats>* AioControllerService::Stub::AsyncAioControllerGetStatsRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerGetStatsRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status AioControllerService::Stub::AioControllerUpdate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest& request, ::opi_api::storage::v1::AioController* response) {
  return ::grpc::internal::BlockingUnaryCall< ::opi_api::storage::v1::AioControllerUpdateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AioControllerUpdate_, context, request, response);
}

void AioControllerService::Stub::async::AioControllerUpdate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest* request, ::opi_api::storage::v1::AioController* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::opi_api::storage::v1::AioControllerUpdateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerUpdate_, context, request, response, std::move(f));
}

void AioControllerService::Stub::async::AioControllerUpdate(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest* request, ::opi_api::storage::v1::AioController* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AioControllerUpdate_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::PrepareAsyncAioControllerUpdateRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::opi_api::storage::v1::AioController, ::opi_api::storage::v1::AioControllerUpdateRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AioControllerUpdate_, context, request);
}

::grpc::ClientAsyncResponseReader< ::opi_api::storage::v1::AioController>* AioControllerService::Stub::AsyncAioControllerUpdateRaw(::grpc::ClientContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAioControllerUpdateRaw(context, request, cq);
  result->StartCall();
  return result;
}

AioControllerService::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerCreateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerCreateRequest* req,
             ::opi_api::storage::v1::AioController* resp) {
               return service->AioControllerCreate(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerDeleteRequest, ::google::protobuf::Empty, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerDeleteRequest* req,
             ::google::protobuf::Empty* resp) {
               return service->AioControllerDelete(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerGetRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerGetRequest* req,
             ::opi_api::storage::v1::AioController* resp) {
               return service->AioControllerGet(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerGetListRequest, ::opi_api::storage::v1::AioControllerList, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerGetListRequest* req,
             ::opi_api::storage::v1::AioControllerList* resp) {
               return service->AioControllerGetList(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerGetStatsRequest, ::opi_api::storage::v1::AioControllerStats, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerGetStatsRequest* req,
             ::opi_api::storage::v1::AioControllerStats* resp) {
               return service->AioControllerGetStats(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      AioControllerService_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< AioControllerService::Service, ::opi_api::storage::v1::AioControllerUpdateRequest, ::opi_api::storage::v1::AioController, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](AioControllerService::Service* service,
             ::grpc::ServerContext* ctx,
             const ::opi_api::storage::v1::AioControllerUpdateRequest* req,
             ::opi_api::storage::v1::AioController* resp) {
               return service->AioControllerUpdate(ctx, req, resp);
             }, this)));
}

AioControllerService::Service::~Service() {
}

::grpc::Status AioControllerService::Service::AioControllerCreate(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerCreateRequest* request, ::opi_api::storage::v1::AioController* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status AioControllerService::Service::AioControllerDelete(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerDeleteRequest* request, ::google::protobuf::Empty* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status AioControllerService::Service::AioControllerGet(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerGetRequest* request, ::opi_api::storage::v1::AioController* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status AioControllerService::Service::AioControllerGetList(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerGetListRequest* request, ::opi_api::storage::v1::AioControllerList* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status AioControllerService::Service::AioControllerGetStats(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerGetStatsRequest* request, ::opi_api::storage::v1::AioControllerStats* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status AioControllerService::Service::AioControllerUpdate(::grpc::ServerContext* context, const ::opi_api::storage::v1::AioControllerUpdateRequest* request, ::opi_api::storage::v1::AioController* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace opi_api
}  // namespace storage
}  // namespace v1


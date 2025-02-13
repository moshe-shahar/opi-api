// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: inventory.proto
// Original file comments:
// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2022 Dell Inc, or its subsidiaries.
// (-- api-linter: core::0140::reserved-words=disabled
//     aip.dev/not-precedent: We do this since inventory may use
//     reserved words --)
// (-- api-linter: core::0123::resource-annotation=disabled
//     aip.dev/not-precedent: Currently not supporting resource annotation --)
// (-- api-linter: core::0142::time-field-type=disabled
//     api.dev/not-precedent: We need to do this because date is a
//     inventory parameter being reported by the device in the set format --)
//
#ifndef GRPC_inventory_2eproto__INCLUDED
#define GRPC_inventory_2eproto__INCLUDED

#include "inventory.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_generic_service.h>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/client_context.h>
#include <grpcpp/impl/codegen/completion_queue.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/proto_utils.h>
#include <grpcpp/impl/codegen/rpc_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/status.h>
#include <grpcpp/impl/codegen/stub_options.h>
#include <grpcpp/impl/codegen/sync_stream.h>

namespace opi_api {
namespace inventory {
namespace v1 {

// Service functions for the device inventory data
class InventorySvc final {
 public:
  static constexpr char const* service_full_name() {
    return "opi_api.inventory.v1.InventorySvc";
  }
  class StubInterface {
   public:
    virtual ~StubInterface() {}
    // retrieves the inventory data for the device
    virtual ::grpc::Status GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::opi_api::inventory::v1::Inventory* response) = 0;
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>> AsyncGetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>>(AsyncGetInventoryRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>> PrepareAsyncGetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>>(PrepareAsyncGetInventoryRaw(context, request, cq));
    }
    class async_interface {
     public:
      virtual ~async_interface() {}
      // retrieves the inventory data for the device
      virtual void GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, std::function<void(::grpc::Status)>) = 0;
      virtual void GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, ::grpc::ClientUnaryReactor* reactor) = 0;
    };
    typedef class async_interface experimental_async_interface;
    virtual class async_interface* async() { return nullptr; }
    class async_interface* experimental_async() { return async(); }
   private:
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>* AsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) = 0;
    virtual ::grpc::ClientAsyncResponseReaderInterface< ::opi_api::inventory::v1::Inventory>* PrepareAsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) = 0;
  };
  class Stub final : public StubInterface {
   public:
    Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());
    ::grpc::Status GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::opi_api::inventory::v1::Inventory* response) override;
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>> AsyncGetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>>(AsyncGetInventoryRaw(context, request, cq));
    }
    std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>> PrepareAsyncGetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) {
      return std::unique_ptr< ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>>(PrepareAsyncGetInventoryRaw(context, request, cq));
    }
    class async final :
      public StubInterface::async_interface {
     public:
      void GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, std::function<void(::grpc::Status)>) override;
      void GetInventory(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response, ::grpc::ClientUnaryReactor* reactor) override;
     private:
      friend class Stub;
      explicit async(Stub* stub): stub_(stub) { }
      Stub* stub() { return stub_; }
      Stub* stub_;
    };
    class async* async() override { return &async_stub_; }

   private:
    std::shared_ptr< ::grpc::ChannelInterface> channel_;
    class async async_stub_{this};
    ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>* AsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) override;
    ::grpc::ClientAsyncResponseReader< ::opi_api::inventory::v1::Inventory>* PrepareAsyncGetInventoryRaw(::grpc::ClientContext* context, const ::opi_api::inventory::v1::GetInventoryRequest& request, ::grpc::CompletionQueue* cq) override;
    const ::grpc::internal::RpcMethod rpcmethod_GetInventory_;
  };
  static std::unique_ptr<Stub> NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options = ::grpc::StubOptions());

  class Service : public ::grpc::Service {
   public:
    Service();
    virtual ~Service();
    // retrieves the inventory data for the device
    virtual ::grpc::Status GetInventory(::grpc::ServerContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response);
  };
  template <class BaseClass>
  class WithAsyncMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithAsyncMethod_GetInventory() {
      ::grpc::Service::MarkMethodAsync(0);
    }
    ~WithAsyncMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetInventory(::grpc::ServerContext* context, ::opi_api::inventory::v1::GetInventoryRequest* request, ::grpc::ServerAsyncResponseWriter< ::opi_api::inventory::v1::Inventory>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  typedef WithAsyncMethod_GetInventory<Service > AsyncService;
  template <class BaseClass>
  class WithCallbackMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithCallbackMethod_GetInventory() {
      ::grpc::Service::MarkMethodCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::opi_api::inventory::v1::GetInventoryRequest* request, ::opi_api::inventory::v1::Inventory* response) { return this->GetInventory(context, request, response); }));}
    void SetMessageAllocatorFor_GetInventory(
        ::grpc::MessageAllocator< ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory>* allocator) {
      ::grpc::internal::MethodHandler* const handler = ::grpc::Service::GetHandler(0);
      static_cast<::grpc::internal::CallbackUnaryHandler< ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory>*>(handler)
              ->SetMessageAllocator(allocator);
    }
    ~WithCallbackMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* GetInventory(
      ::grpc::CallbackServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/)  { return nullptr; }
  };
  typedef WithCallbackMethod_GetInventory<Service > CallbackService;
  typedef CallbackService ExperimentalCallbackService;
  template <class BaseClass>
  class WithGenericMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithGenericMethod_GetInventory() {
      ::grpc::Service::MarkMethodGeneric(0);
    }
    ~WithGenericMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
  };
  template <class BaseClass>
  class WithRawMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawMethod_GetInventory() {
      ::grpc::Service::MarkMethodRaw(0);
    }
    ~WithRawMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    void RequestGetInventory(::grpc::ServerContext* context, ::grpc::ByteBuffer* request, ::grpc::ServerAsyncResponseWriter< ::grpc::ByteBuffer>* response, ::grpc::CompletionQueue* new_call_cq, ::grpc::ServerCompletionQueue* notification_cq, void *tag) {
      ::grpc::Service::RequestAsyncUnary(0, context, request, response, new_call_cq, notification_cq, tag);
    }
  };
  template <class BaseClass>
  class WithRawCallbackMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithRawCallbackMethod_GetInventory() {
      ::grpc::Service::MarkMethodRawCallback(0,
          new ::grpc::internal::CallbackUnaryHandler< ::grpc::ByteBuffer, ::grpc::ByteBuffer>(
            [this](
                   ::grpc::CallbackServerContext* context, const ::grpc::ByteBuffer* request, ::grpc::ByteBuffer* response) { return this->GetInventory(context, request, response); }));
    }
    ~WithRawCallbackMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable synchronous version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    virtual ::grpc::ServerUnaryReactor* GetInventory(
      ::grpc::CallbackServerContext* /*context*/, const ::grpc::ByteBuffer* /*request*/, ::grpc::ByteBuffer* /*response*/)  { return nullptr; }
  };
  template <class BaseClass>
  class WithStreamedUnaryMethod_GetInventory : public BaseClass {
   private:
    void BaseClassMustBeDerivedFromService(const Service* /*service*/) {}
   public:
    WithStreamedUnaryMethod_GetInventory() {
      ::grpc::Service::MarkMethodStreamed(0,
        new ::grpc::internal::StreamedUnaryHandler<
          ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory>(
            [this](::grpc::ServerContext* context,
                   ::grpc::ServerUnaryStreamer<
                     ::opi_api::inventory::v1::GetInventoryRequest, ::opi_api::inventory::v1::Inventory>* streamer) {
                       return this->StreamedGetInventory(context,
                         streamer);
                  }));
    }
    ~WithStreamedUnaryMethod_GetInventory() override {
      BaseClassMustBeDerivedFromService(this);
    }
    // disable regular version of this method
    ::grpc::Status GetInventory(::grpc::ServerContext* /*context*/, const ::opi_api::inventory::v1::GetInventoryRequest* /*request*/, ::opi_api::inventory::v1::Inventory* /*response*/) override {
      abort();
      return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
    }
    // replace default version of method with streamed unary
    virtual ::grpc::Status StreamedGetInventory(::grpc::ServerContext* context, ::grpc::ServerUnaryStreamer< ::opi_api::inventory::v1::GetInventoryRequest,::opi_api::inventory::v1::Inventory>* server_unary_streamer) = 0;
  };
  typedef WithStreamedUnaryMethod_GetInventory<Service > StreamedUnaryService;
  typedef Service SplitStreamedService;
  typedef WithStreamedUnaryMethod_GetInventory<Service > StreamedService;
};

}  // namespace v1
}  // namespace inventory
}  // namespace opi_api


#endif  // GRPC_inventory_2eproto__INCLUDED

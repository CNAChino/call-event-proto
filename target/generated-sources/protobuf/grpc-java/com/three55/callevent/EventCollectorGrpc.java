package com.three55.callevent;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: CallEvent.proto")
public final class EventCollectorGrpc {

  private EventCollectorGrpc() {}

  public static final String SERVICE_NAME = "callevent.EventCollector";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.three55.callevent.CallEventProto.CallEvent,
      com.three55.callevent.CallEventProto.Acknowledgement> getPublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Publish",
      requestType = com.three55.callevent.CallEventProto.CallEvent.class,
      responseType = com.three55.callevent.CallEventProto.Acknowledgement.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.three55.callevent.CallEventProto.CallEvent,
      com.three55.callevent.CallEventProto.Acknowledgement> getPublishMethod() {
    io.grpc.MethodDescriptor<com.three55.callevent.CallEventProto.CallEvent, com.three55.callevent.CallEventProto.Acknowledgement> getPublishMethod;
    if ((getPublishMethod = EventCollectorGrpc.getPublishMethod) == null) {
      synchronized (EventCollectorGrpc.class) {
        if ((getPublishMethod = EventCollectorGrpc.getPublishMethod) == null) {
          EventCollectorGrpc.getPublishMethod = getPublishMethod = 
              io.grpc.MethodDescriptor.<com.three55.callevent.CallEventProto.CallEvent, com.three55.callevent.CallEventProto.Acknowledgement>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "callevent.EventCollector", "Publish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.three55.callevent.CallEventProto.CallEvent.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.three55.callevent.CallEventProto.Acknowledgement.getDefaultInstance()))
                  .setSchemaDescriptor(new EventCollectorMethodDescriptorSupplier("Publish"))
                  .build();
          }
        }
     }
     return getPublishMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventCollectorStub newStub(io.grpc.Channel channel) {
    return new EventCollectorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventCollectorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventCollectorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventCollectorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventCollectorFutureStub(channel);
  }

  /**
   */
  public static abstract class EventCollectorImplBase implements io.grpc.BindableService {

    /**
     */
    public void publish(com.three55.callevent.CallEventProto.CallEvent request,
        io.grpc.stub.StreamObserver<com.three55.callevent.CallEventProto.Acknowledgement> responseObserver) {
      asyncUnimplementedUnaryCall(getPublishMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPublishMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.three55.callevent.CallEventProto.CallEvent,
                com.three55.callevent.CallEventProto.Acknowledgement>(
                  this, METHODID_PUBLISH)))
          .build();
    }
  }

  /**
   */
  public static final class EventCollectorStub extends io.grpc.stub.AbstractStub<EventCollectorStub> {
    private EventCollectorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventCollectorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventCollectorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventCollectorStub(channel, callOptions);
    }

    /**
     */
    public void publish(com.three55.callevent.CallEventProto.CallEvent request,
        io.grpc.stub.StreamObserver<com.three55.callevent.CallEventProto.Acknowledgement> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventCollectorBlockingStub extends io.grpc.stub.AbstractStub<EventCollectorBlockingStub> {
    private EventCollectorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventCollectorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventCollectorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventCollectorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.three55.callevent.CallEventProto.Acknowledgement publish(com.three55.callevent.CallEventProto.CallEvent request) {
      return blockingUnaryCall(
          getChannel(), getPublishMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventCollectorFutureStub extends io.grpc.stub.AbstractStub<EventCollectorFutureStub> {
    private EventCollectorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventCollectorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventCollectorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventCollectorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.three55.callevent.CallEventProto.Acknowledgement> publish(
        com.three55.callevent.CallEventProto.CallEvent request) {
      return futureUnaryCall(
          getChannel().newCall(getPublishMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUBLISH = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventCollectorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventCollectorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUBLISH:
          serviceImpl.publish((com.three55.callevent.CallEventProto.CallEvent) request,
              (io.grpc.stub.StreamObserver<com.three55.callevent.CallEventProto.Acknowledgement>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EventCollectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventCollectorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.three55.callevent.CallEventProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventCollector");
    }
  }

  private static final class EventCollectorFileDescriptorSupplier
      extends EventCollectorBaseDescriptorSupplier {
    EventCollectorFileDescriptorSupplier() {}
  }

  private static final class EventCollectorMethodDescriptorSupplier
      extends EventCollectorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventCollectorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EventCollectorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventCollectorFileDescriptorSupplier())
              .addMethod(getPublishMethod())
              .build();
        }
      }
    }
    return result;
  }
}

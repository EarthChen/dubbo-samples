package org.apache.dubbo.sample.tri.manual;

import org.apache.dubbo.common.stream.StreamObserver;
import org.apache.dubbo.sample.tri.Greeter;
import org.apache.dubbo.sample.tri.GreeterReply;
import org.apache.dubbo.sample.tri.GreeterRequest;
import org.apache.dubbo.sample.tri.stub.GreeterImpl;

public class ManualGreeterImpl implements Greeter {
    private final Greeter delegate;

    public ManualGreeterImpl() {
        this.delegate = new GreeterImpl("tri-manual");
    }

    @Override
    public GreeterReply greet(GreeterRequest request) {
        return delegate.greet(request);
    }

    @Override
    public GreeterReply upperCaseGreet(GreeterRequest request) {
        return delegate.upperCaseGreet(request);
    }

    @Override
    public GreeterReply greetWithAttachment(GreeterRequest request) {
        return delegate.greetWithAttachment(request);
    }

    @Override
    public GreeterReply greetReturnBigAttachment(GreeterRequest request) {
        return delegate.greetReturnBigAttachment(request);
    }

    @Override
    public GreeterReply greetException(GreeterRequest request) {
        return delegate.greetException(request);
    }

    @Override
    public GreeterReply queryCancelResult(GreeterRequest request) {
        return delegate.queryCancelResult(request);
    }

    @Override
    public void greetServerStream(GreeterRequest request, StreamObserver<GreeterReply> responseObserver) {
        delegate.greetServerStream(request, responseObserver);
    }

    @Override
    public void cancelServerStream(GreeterRequest request, StreamObserver<GreeterReply> responseObserver) {
        delegate.cancelServerStream(request, responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> greetStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.greetStream(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> cancelBiStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.cancelBiStream(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> cancelBiStream2(StreamObserver<GreeterReply> responseObserver) {
        return delegate.cancelBiStream2(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> compressorBiStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.compressorBiStream(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> clientCompressorBiStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.clientCompressorBiStream(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> serverCompressorBiStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.serverCompressorBiStream(responseObserver);
    }

    @Override
    public StreamObserver<GreeterRequest> greetClientStream(StreamObserver<GreeterReply> responseObserver) {
        return delegate.greetClientStream(responseObserver);
    }
}

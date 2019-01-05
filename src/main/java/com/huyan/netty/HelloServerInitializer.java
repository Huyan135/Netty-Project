package com.huyan.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

public class HelloServerInitializer extends ChannelInitializer<SocketChannel> {

	@Override
	protected void initChannel(SocketChannel channel) throws Exception {
		//ͨ��SocketChannelȥ��ö�Ӧ�Ĺܵ�
		ChannelPipeline pipeline = channel.pipeline();
		//ͨ���ܵ������handler
		//HTTPserverCodec����netty�Լ��ṩ�������࣬�������Ϊ������
		//�����󵽷���ˣ�������Ҫ�����룬��Ӧ���ͻ���������
		pipeline.addLast("HttpServerCodec",new HttpServerCodec());
		
		//����Զ���������࣬���ء�hello netty~��
		pipeline.addLast("HttpServerCodec", null);
	}
	
}

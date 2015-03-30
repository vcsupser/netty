/**
 *  @author vc  DateTime 2015年3月30日 下午2:06:01    
 *  @version 1.0 
 */
package com.vc.netty.simplechat.client;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SimpleChatClientHandler extends  SimpleChannelInboundHandler<String> {
//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, String s) throws Exception {
//        System.out.println(s);
//    }

	@Override
	protected void messageReceived(ChannelHandlerContext ctx, String msg)
			throws Exception {
		System.out.println(msg);
		
	}
}
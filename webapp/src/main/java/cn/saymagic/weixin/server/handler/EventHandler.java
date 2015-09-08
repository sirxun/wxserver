package cn.saymagic.weixin.server.handler;


import cn.saymagic.weixin.server.bean.MsgRequest;

public class EventHandler extends BaseHandler {
	@Override
	public String doHandleMsg(MsgRequest msgRequest) {
		if(!"event".equals(msgRequest.getMsgType()))
			return null;
		else
			if("subscribe".equals(msgRequest.getEvent())){
				return getResponseStringByContent("你好~我是咩咩咩~我能跟你聊会天嘛~", msgRequest);
			}else if("CLICK".equals(msgRequest.getEvent())){
				String eventKey = msgRequest.getEventKey();
				String content = "";
				content = "Click Menu"+msgRequest.getEventKey();
				return getResponseStringByContent(content, msgRequest);
			}
			else{ 
				return getResponseStringByContent("咩咩咩正在睡觉，请等他睡醒哟~", msgRequest);
			}

	}
}

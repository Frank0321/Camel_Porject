/**
 * @Description : 對應 routes 裡的 bean
 * @ClassName : SampleBean.java
 * @Copyright : Copyright (c) 2023 
 * @ModifyHistory : 
 *  v1.00, 2023/07/02, frankchang
 *   1) First Release.
 */

package com.example.camel_project_1.bean;

import lombok.Data;

@Data
public class SampleBean {

	private String say;
	
	/***
	 * routes 會呼叫的方法
	 * @return
	 */
    public String saySomething() {
        return say;
    }
}

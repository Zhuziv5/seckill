package org.seckill.exception;
/**
 * 秒杀相关异常
 * @author XXZ
 *
 */
public class SeckillException extends RuntimeException{

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}


}

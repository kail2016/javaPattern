package com.company.behavior.template;

/**
 * Created by zhouhui on 2018/2/13.
 */
public abstract class Game {

	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();

	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}

}

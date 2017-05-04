package com.muni.batch.Tasklet;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import com.muni.batch.service.UpdateUserService;

public class UpdateUserTasklet implements Tasklet,StepExecutionListener {
	
	private StepExecution stepExecution;
	
	private UpdateUserService updateUserService;

	public UpdateUserService getUpdateUserService() {
		return updateUserService;
	}

	public void setUpdateUserService(UpdateUserService updateUserService) {
		this.updateUserService = updateUserService;
	}

	public void beforeStep(StepExecution stepExecution) {
		this.stepExecution =stepExecution;
	}

	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		return null;
	}

	public RepeatStatus execute(StepContribution contribution,
			ChunkContext chunkContext) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

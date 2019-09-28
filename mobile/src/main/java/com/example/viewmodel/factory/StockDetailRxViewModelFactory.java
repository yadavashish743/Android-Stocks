package com.example.viewmodel.factory;

import android.os.Bundle;

import com.example.viewmodel.StockDetailRxViewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class StockDetailRxViewModelFactory extends ViewModelProvider.NewInstanceFactory {
	private final Bundle mExtras;

	public StockDetailRxViewModelFactory(Bundle extras) {
		mExtras = extras;
	}

	@NonNull
	@Override
	@SuppressWarnings("unchecked")
	public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
		return (T) new StockDetailRxViewModel(mExtras);
	}
}

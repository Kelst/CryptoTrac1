package com.cryptoworld.tradersrank.ui

import android.annotation.SuppressLint
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import com.cryptoworld.tradersrank.ui.theme.TickerListCompose
import com.cryptoworld.tradersrank.ui.tickers.TickerListHeader
import com.cryptoworld.tradersrank.viewmodels.TickersViewModel

@SuppressLint("UnusedCrossfadeTargetStateParameter")
@Composable
fun MainScreenCompose(tickersViewModel: TickersViewModel, onNavigateOrderBook: (String, String) -> Unit) {
    val currentTab: Tabs? by tickersViewModel.currentTab.observeAsState()

    Scaffold(
        topBar = { AppTopBar() }
        ) {
        Column {
            AppTabBar(tickersViewModel)
            TickerListHeader(tickersViewModel)
            Crossfade(targetState = currentTab) {
                TickerListCompose(tickersViewModel, onNavigateOrderBook)
            }
        }
    }
}
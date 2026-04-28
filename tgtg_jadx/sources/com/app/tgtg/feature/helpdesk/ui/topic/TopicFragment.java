package com.app.tgtg.feature.helpdesk.ui.topic;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.app.tgtg.R;
import cv.i;
import ik.b;
import kotlin.Metadata;
import lk.a;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/helpdesk/ui/topic/TopicFragment;", "Lik/b;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TopicFragment extends b {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new d(new a(this, 0), true, -831568801));
        return composeView;
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o().f16067c.b(i.SCREEN_HELPCENTER);
        String string = getString(R.string.helpdesk_topic_toolbar_title);
        string.getClass();
        s(string);
    }
}

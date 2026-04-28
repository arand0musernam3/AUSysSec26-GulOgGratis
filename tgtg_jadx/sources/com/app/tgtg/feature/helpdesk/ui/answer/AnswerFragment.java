package com.app.tgtg.feature.helpdesk.ui.answer;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.app.tgtg.model.remote.order.Order;
import cv.b;
import cv.i;
import dv.a;
import dv.c;
import ek.q;
import g3.y0;
import h0.g;
import jk.f;
import kotlin.Metadata;
import kotlin.Pair;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/helpdesk/ui/answer/AnswerFragment;", "Lik/b;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AnswerFragment extends f {
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new d(new y0(this, 22), true, 559138894));
        return composeView;
    }

    @Override // ik.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Order order;
        view.getClass();
        super.onViewCreated(view, bundle);
        q qVarO = o();
        hk.d dVar = qVarO.f16075k;
        if (dVar != null && (str = dVar.l) != null) {
            b bVar = qVarO.f16067c;
            i iVar = i.SCREEN_HELPCENTER_TOPIC;
            Pair pair = new Pair(a.TOPIC, new c(str));
            a aVar = a.ITEM_TYPE;
            hk.c cVarB = qVarO.b();
            bVar.c(iVar, g.E(pair, new Pair(aVar, new c((cVarB == null || (order = cVarB.f22092d) == null) ? null : order.orderTypeMappedToItemTypeForTracking()))));
        }
        hk.c cVarA = o().a();
        if (cVarA != null) {
            String string = getString(cVarA.f22089a);
            string.getClass();
            s(string);
        }
    }
}

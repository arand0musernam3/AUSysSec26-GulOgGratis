package com.app.tgtg.feature.tabprofile.storelogin.ui;

import a70.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o0;
import c50.w;
import com.app.tgtg.R;
import kotlin.Metadata;
import lv.s;
import pd.g;
import pg.v;
import zs.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/tgtg/feature/tabprofile/storelogin/ui/RecommendStoreSuccessFragment;", "Lzs/j;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecommendStoreSuccessFragment extends j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f9449m;

    public RecommendStoreSuccessFragment() {
        super(R.layout.recommend_store_success_view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.recommend_store_success_view, viewGroup, false);
        int i11 = R.id.btnSaveBag;
        Button button = (Button) g.t(R.id.btnSaveBag, viewInflate);
        if (button != null) {
            i11 = R.id.successIcon;
            if (((ImageView) g.t(R.id.successIcon, viewInflate)) != null) {
                i11 = R.id.tvSuccessDescription;
                if (((TextView) g.t(R.id.tvSuccessDescription, viewInflate)) != null) {
                    i11 = R.id.tvThanks;
                    if (((TextView) g.t(R.id.tvThanks, viewInflate)) != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f9449m = new v(constraintLayout, button, 5);
                        constraintLayout.getClass();
                        return constraintLayout;
                    }
                }
            }
        }
        w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
        return null;
    }

    @Override // zs.j, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        o0 o0VarRequireActivity = requireActivity();
        o0VarRequireActivity.getClass();
        a.t(o0VarRequireActivity, s.f28217b);
        ((LinearLayout) o().f34797e).setVisibility(8);
        v vVar = this.f9449m;
        vVar.getClass();
        ((Button) vVar.f35202c).setOnClickListener(new zendesk.ui.android.conversation.bottomsheet.a(this, 3));
    }
}

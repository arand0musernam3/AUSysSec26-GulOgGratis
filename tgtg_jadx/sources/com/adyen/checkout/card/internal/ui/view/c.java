package com.adyen.checkout.card.internal.ui.view;

import android.widget.Button;
import android.widget.CompoundButton;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.cashapppay.internal.ui.view.CashAppPayView;
import com.app.tgtg.customview.manufactureaddressfragment.AddressEditText;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.google.android.material.chip.Chip;
import e20.j;
import h0.g;
import jg.a0;
import kotlin.Pair;
import lz.i;
import pg.x0;
import tm.e;
import zj.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8813b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f8812a = i11;
        this.f8813b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
        switch (this.f8812a) {
            case 0:
                CardView.initView$lambda$1((CardDelegate) this.f8813b, compoundButton, z11);
                break;
            case 1:
                CashAppPayView.initSwitch$lambda$1((CashAppPayView) this.f8813b, compoundButton, z11);
                break;
            case 2:
                x0 x0Var = ((EmailAccessActivity) this.f8813b).f9045g;
                x0Var.getClass();
                ((Button) x0Var.f35265f).setEnabled(z11);
                break;
            case 3:
                AddressEditText addressEditText = ((a0) this.f8813b).f25145a.l;
                addressEditText.setEnable(!z11);
                if (z11) {
                    addressEditText.setEtText("");
                }
                break;
            case 4:
                Chip chip = (Chip) this.f8813b;
                j jVar = chip.f12421j;
                if (jVar != null) {
                    e20.a aVar = (e20.a) ((i) jVar).f28446b;
                    if (!z11 ? aVar.j(chip, aVar.f15578b) : aVar.b(chip)) {
                        aVar.g();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f12420i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z11);
                }
                break;
            default:
                h hVar = (h) this.f8813b;
                compoundButton.getClass();
                if (!hVar.isDetached()) {
                    hVar.q().f47948a.f17901a.setShowOnlyAvailable(!z11);
                    ((e) hVar.f47946h.getValue()).f40307b.c(cv.i.TEMP_ACTION_SOLD_OUT, g.E(new Pair(dv.a.ACTION, new dv.c(z11 ? "show" : "hide"))));
                }
                break;
        }
    }
}

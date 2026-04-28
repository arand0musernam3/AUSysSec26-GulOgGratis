package e20;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends jb.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15642f;

    public /* synthetic */ d0(Object obj, int i11) {
        this.f15641e = i11;
        this.f15642f = obj;
    }

    @Override // jb.u
    public final void J(int i11) {
        switch (this.f15641e) {
            case 0:
                f0 f0Var = (f0) this.f15642f;
                f0Var.f15651e = true;
                e0 e0Var = (e0) f0Var.f15652f.get();
                if (e0Var != null) {
                    e0Var.a();
                }
                break;
        }
    }

    @Override // jb.u
    public final void K(Typeface typeface, boolean z11) {
        switch (this.f15641e) {
            case 0:
                if (!z11) {
                    f0 f0Var = (f0) this.f15642f;
                    f0Var.f15651e = true;
                    e0 e0Var = (e0) f0Var.f15652f.get();
                    if (e0Var != null) {
                        e0Var.a();
                    }
                    break;
                }
                break;
            default:
                Chip chip = (Chip) this.f15642f;
                t10.b bVar = chip.f12416e;
                chip.setText(bVar.S1 ? bVar.O : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
        }
    }

    private final void V(int i11) {
    }
}

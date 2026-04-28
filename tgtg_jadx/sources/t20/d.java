package t20;

import com.google.android.material.internal.CheckableImageButton;
import d40.t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i11) {
        super(lVar);
        this.f39679e = i11;
    }

    @Override // t20.m
    public void q() {
        switch (this.f39679e) {
            case 0:
                l lVar = this.f39721b;
                lVar.f39712o = null;
                CheckableImageButton checkableImageButton = lVar.f39705g;
                checkableImageButton.setOnLongClickListener(null);
                t1.I(checkableImageButton, null);
                break;
        }
    }
}

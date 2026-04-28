package ui;

import com.app.tgtg.model.remote.order.AbortState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class a2 extends o2 {

    @NotNull
    public static final z1 Companion = new z1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbortState f41169b;

    public /* synthetic */ a2(int i11, AbortState abortState) {
        if (1 == (i11 & 1)) {
            this.f41169b = abortState;
        } else {
            m90.c1.j(i11, 1, y1.f41301a.getDescriptor());
            throw null;
        }
    }

    public a2(AbortState abortState) {
        this.f41169b = abortState;
    }
}

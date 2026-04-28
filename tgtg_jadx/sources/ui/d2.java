package ui;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class d2 extends o2 {

    @NotNull
    public static final c2 Companion = new c2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41186b;

    public /* synthetic */ d2(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f41186b = str;
        } else {
            m90.c1.j(i11, 1, b2.f41174a.getDescriptor());
            throw null;
        }
    }

    public d2(String str) {
        this.f41186b = str;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11577a;

    public /* synthetic */ kh(int i11) {
        this.f11577a = i11;
    }

    public final void a(tg tgVar, Iterator it, gh ghVar) {
        switch (this.f11577a) {
            case 0:
                break;
            default:
                if (!tgVar.f11909c) {
                    com.braze.h2.b("non repeating key");
                } else if (tgVar.f11910d && ((g0) g0.f11427b.get()).f11428a > 20) {
                    while (it.hasNext()) {
                        ghVar.a(it.next(), tgVar.f11907a);
                    }
                } else {
                    tgVar.a(it, ghVar);
                }
                break;
        }
    }

    private final void b(tg tgVar, Iterator it, gh ghVar) {
    }
}

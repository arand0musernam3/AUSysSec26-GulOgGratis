package oa0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {
    @Override // oa0.a
    public final List a(Executor executor) {
        return Arrays.asList(new i(0), new m(executor));
    }

    @Override // oa0.a
    public final List b() {
        return Collections.singletonList(new b(1));
    }
}

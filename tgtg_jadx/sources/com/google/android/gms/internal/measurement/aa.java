package com.google.android.gms.internal.measurement;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class aa extends com.google.android.gms.common.api.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11252a = 0;

    static {
        Pair.create(new h1(11), Tasks.d(null));
    }

    public final Task c(String str) {
        qz.t tVarBuilder = qz.u.builder();
        tVarBuilder.f37388a = new uc(str, 2);
        return doRead(tVarBuilder.a());
    }
}

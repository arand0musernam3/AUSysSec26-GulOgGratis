package com.braze.requests.framework.queue;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return w70.a.a(Long.valueOf(((com.braze.requests.framework.h) obj).f10417b), Long.valueOf(((com.braze.requests.framework.h) obj2).f10417b));
    }
}

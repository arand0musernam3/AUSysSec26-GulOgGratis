package com.google.android.gms.common.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a10.a f11122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f11123f;

    public i(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f11118a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.f11120c = str;
        this.f11121d = str2;
        this.f11122e = a10.a.f190a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
        this.f11119b = Collections.unmodifiableSet(hashSet);
    }
}

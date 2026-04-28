package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11256a = Pattern.compile("[a-z]+(_[a-z]+)*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Account f11257b = xd.f12039a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f11258c = Collections.unmodifiableSet(new HashSet(Arrays.asList("default", "unused", "special", "reserved", "shared", "virtual", "managed")));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f11259d = Collections.unmodifiableSet(new HashSet(Arrays.asList("files", "cache", "managed", "directboot-files", "directboot-cache", "external")));
}

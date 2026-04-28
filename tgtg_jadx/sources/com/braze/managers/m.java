package com.braze.managers;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f10052a = new m();

    public static String a() {
        return e0.f.k("Unsupported type for map deserialization: ", Reflection.getOrCreateKotlinClass(Long.class).getSimpleName());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return a();
    }
}

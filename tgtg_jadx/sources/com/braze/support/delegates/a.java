package com.braze.support.delegates;

import com.braze.support.BrazeLogger;
import k80.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import m90.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10756a;

    public static final String a(Object obj, KProperty kProperty) {
        return "Cannot assign " + obj + " to only-set-once property " + kProperty.getName();
    }

    @Override // k80.c
    public final Object getValue(Object obj, KProperty kProperty) {
        obj.getClass();
        kProperty.getClass();
        return this.f10756a;
    }

    @Override // k80.d
    public final void setValue(Object obj, KProperty kProperty, Object obj2) {
        obj.getClass();
        kProperty.getClass();
        Object obj3 = this.f10756a;
        if (obj3 == null) {
            this.f10756a = obj2;
        } else {
            if (Intrinsics.areEqual(obj3, obj2)) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z(18, obj2, kProperty), 7, (Object) null);
        }
    }
}

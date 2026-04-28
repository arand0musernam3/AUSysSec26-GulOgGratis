package a90;

import kotlin.jvm.internal.PropertyReference0Impl;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k extends PropertyReference0Impl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, i11);
        this.f1031a = i12;
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
    public final Object get() {
        switch (this.f1031a) {
        }
        return ((c3) this.receiver).getValue();
    }
}

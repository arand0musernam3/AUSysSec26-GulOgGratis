package com.braze.requests.framework;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f10397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, x70.c cVar) {
        super(2, cVar);
        this.f10397c = gVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        d dVar = new d(this.f10397c, cVar);
        dVar.f10396b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.f10397c, (x70.c) obj2);
        dVar.f10396b = (b0) obj;
        return dVar.invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b3 -> B:12:0x002e). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.requests.framework.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package com.braze.communication.dust;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import v80.b0;
import x80.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f9595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f9596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f9597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function1 f9598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ref.ObjectRef f9599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ref.ObjectRef f9600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f9601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f9602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9603i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, z70.c cVar) {
        super(cVar);
        this.f9602h = iVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f9601g = obj;
        this.f9603i |= Integer.MIN_VALUE;
        return this.f9602h.a(null, null, null, this);
    }
}

package xj;

import com.app.tgtg.model.remote.item.response.BasicItem;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f44397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f44398k;
    public BasicItem l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f44399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ k f44403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BasicItem f44404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f44405s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, BasicItem basicItem, boolean z11, x70.c cVar) {
        super(2, cVar);
        this.f44403q = kVar;
        this.f44404r = basicItem;
        this.f44405s = z11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new j(this.f44403q, this.f44404r, this.f44405s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f4, code lost:
    
        if (kotlin.Unit.f26487a == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

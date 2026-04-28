package nh;

import com.app.tgtg.model.remote.discover.request.BucketFillerType;
import java.util.ArrayList;
import z70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BucketFillerType f30847j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f30848k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f30849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30850n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f30849m = bVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f30850n |= Integer.MIN_VALUE;
        return b.a(this.f30849m, null, null, this);
    }
}

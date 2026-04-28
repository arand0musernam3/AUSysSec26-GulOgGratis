package ip;

import com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f24078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.ObjectRef f24079k;
    public Ref.BooleanRef l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Ref.ObjectRef f24080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f24081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f24082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f24083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f24084q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ RecipeGeneratorPollingHelper f24085r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24086s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecipeGeneratorPollingHelper recipeGeneratorPollingHelper, z70.c cVar) {
        super(cVar);
        this.f24085r = recipeGeneratorPollingHelper;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f24084q = obj;
        this.f24086s |= Integer.MIN_VALUE;
        return this.f24085r.f(null, 0L, this);
    }
}

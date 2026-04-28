package ip;

import com.app.tgtg.feature.recipegenerator.network.RecipeGeneratorPollingHelper;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f24076j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecipeGeneratorPollingHelper f24077k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RecipeGeneratorPollingHelper recipeGeneratorPollingHelper, z70.c cVar) {
        super(cVar);
        this.f24077k = recipeGeneratorPollingHelper;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f24076j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f24077k.d(this);
    }
}

package zendesk.android.internal.proactivemessaging;

import ba0.g;
import com.braze.h2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import x70.c;
import y70.a;
import z70.e;
import z70.i;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001d\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "Lv80/x;", "persistenceDispatcher", "<init>", "(Lzendesk/storage/android/Storage;Lv80/x;)V", "", "campaignId", "", "addSendOnceCampaign", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "removeSendOnceCampaign", "", "getSendOnceCampaignIds", "(Lx70/c;)Ljava/lang/Object;", "Lzendesk/storage/android/Storage;", "Lv80/x;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProactiveMessagingStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String KEY_SEND_ONCE_CAMPAIGN_IDS = "ProactiveMessagingStorage.KEY_SEND_ONCE_CAMPAIGN_IDS";

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$addSendOnceCampaign$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$addSendOnceCampaign$2", f = "ProactiveMessagingStorage.kt", l = {32}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nProactiveMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$addSendOnceCampaign$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,57:1\n43#2,2:58\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$addSendOnceCampaign$2\n*L\n35#1:58,2\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $campaignId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$campaignId = str;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new AnonymousClass2(this.$campaignId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ProactiveMessagingStorage proactiveMessagingStorage = ProactiveMessagingStorage.this;
                this.label = 1;
                obj = proactiveMessagingStorage.getSendOnceCampaignIds(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            ArrayList arrayListT0 = CollectionsKt.t0((Collection) obj);
            arrayListT0.add(this.$campaignId);
            ProactiveMessagingStorage.this.storage.set(ProactiveMessagingStorage.KEY_SEND_ONCE_CAMPAIGN_IDS, new SendOnceCampaignsStorage(arrayListT0), SendOnceCampaignsStorage.class);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$getSendOnceCampaignIds$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$getSendOnceCampaignIds$2", f = "ProactiveMessagingStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "", "", "<anonymous>", "(Lv80/b0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nProactiveMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$getSendOnceCampaignIds$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,57:1\n20#2,7:58\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$getSendOnceCampaignIds$2\n*L\n45#1:58,7\n*E\n"})
    public static final class C01992 extends i implements Function2<b0, c<? super List<? extends String>>, Object> {
        int label;

        public C01992(c<? super C01992> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new C01992(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super List<String>> cVar) {
            return ((C01992) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r0 = r4.label
                if (r0 != 0) goto L79
                ba0.g.M(r5)
                zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage r5 = zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage.this
                zendesk.storage.android.Storage r5 = zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage.access$getStorage$p(r5)
                java.lang.Class<zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage> r0 = zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage.class
                java.lang.String r1 = r0.getName()
                int r2 = r1.hashCode()
                java.lang.String r3 = "ProactiveMessagingStorage.KEY_SEND_ONCE_CAMPAIGN_IDS"
                switch(r2) {
                    case -2056817302: goto L55;
                    case -527879800: goto L43;
                    case 344809556: goto L31;
                    case 398795216: goto L1f;
                    default: goto L1e;
                }
            L1e:
                goto L66
            L1f:
                java.lang.String r2 = "java.lang.Long"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L28
                goto L66
            L28:
                java.lang.Class r0 = java.lang.Long.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage r5 = (zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage) r5
                goto L6a
            L31:
                java.lang.String r2 = "java.lang.Boolean"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3a
                goto L66
            L3a:
                java.lang.Class r0 = java.lang.Boolean.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage r5 = (zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage) r5
                goto L6a
            L43:
                java.lang.String r2 = "java.lang.Float"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L4c
                goto L66
            L4c:
                java.lang.Class r0 = java.lang.Float.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage r5 = (zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage) r5
                goto L6a
            L55:
                java.lang.String r2 = "java.lang.Integer"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L66
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage r5 = (zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage) r5
                goto L6a
            L66:
                java.lang.Object r5 = r5.get(r3, r0)
            L6a:
                zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage r5 = (zendesk.android.internal.proactivemessaging.SendOnceCampaignsStorage) r5
                if (r5 == 0) goto L76
                java.util.List r5 = r5.getCampaignIds()
                if (r5 != 0) goto L75
                goto L76
            L75:
                return r5
            L76:
                kotlin.collections.n0 r5 = kotlin.collections.n0.f26529a
                return r5
            L79:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage.C01992.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$removeSendOnceCampaign$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingStorage$removeSendOnceCampaign$2", f = "ProactiveMessagingStorage.kt", l = {39}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nProactiveMessagingStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$removeSendOnceCampaign$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,57:1\n774#2:58\n865#2,2:59\n43#3,2:61\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingStorage.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$removeSendOnceCampaign$2\n*L\n40#1:58\n40#1:59,2\n41#1:61,2\n*E\n"})
    public static final class C02002 extends i implements Function2<b0, c<? super Unit>, Object> {
        final /* synthetic */ String $campaignId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02002(String str, c<? super C02002> cVar) {
            super(2, cVar);
            this.$campaignId = str;
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return ProactiveMessagingStorage.this.new C02002(this.$campaignId, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((C02002) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                ProactiveMessagingStorage proactiveMessagingStorage = ProactiveMessagingStorage.this;
                this.label = 1;
                obj = proactiveMessagingStorage.getSendOnceCampaignIds(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            String str = this.$campaignId;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (!Intrinsics.areEqual((String) obj2, str)) {
                    arrayList.add(obj2);
                }
            }
            ProactiveMessagingStorage.this.storage.set(ProactiveMessagingStorage.KEY_SEND_ONCE_CAMPAIGN_IDS, new SendOnceCampaignsStorage(arrayList), SendOnceCampaignsStorage.class);
            return Unit.f26487a;
        }
    }

    public ProactiveMessagingStorage(@NotNull Storage storage, @NotNull x xVar) {
        storage.getClass();
        xVar.getClass();
        this.storage = storage;
        this.persistenceDispatcher = xVar;
    }

    @Nullable
    public final Object addSendOnceCampaign(@NotNull String str, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new AnonymousClass2(str, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getSendOnceCampaignIds(@NotNull c<? super List<String>> cVar) {
        return f0.K(this.persistenceDispatcher, new C01992(null), cVar);
    }

    @Nullable
    public final Object removeSendOnceCampaign(@NotNull String str, @NotNull c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C02002(str, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage$Companion;", "", "<init>", "()V", "KEY_SEND_ONCE_CAMPAIGN_IDS", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}

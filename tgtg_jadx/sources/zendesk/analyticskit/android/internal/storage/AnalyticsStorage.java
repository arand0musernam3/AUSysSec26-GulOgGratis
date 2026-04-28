package zendesk.analyticskit.android.internal.storage;

import ba0.g;
import com.braze.h2;
import com.braze.models.FeatureFlag;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import m90.d;
import n90.c;
import n90.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import y70.a;
import y9.w;
import yj.m;
import z70.e;
import z70.i;
import zendesk.analyticskit.android.model.AnalyticsEvent;
import zendesk.storage.android.Storage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u0019\u0010\u0015J\u001e\u0010\u001b\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001f¨\u0006!"}, d2 = {"Lzendesk/analyticskit/android/internal/storage/AnalyticsStorage;", "", "Lzendesk/storage/android/Storage;", "storage", "Lv80/x;", "persistenceDispatcher", "Ln90/c;", "json", "<init>", "(Lzendesk/storage/android/Storage;Lv80/x;Ln90/c;)V", "", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "updatedEvents", "", "saveAnalyticsEvents", "(Ljava/util/List;)V", "", FeatureFlag.ENABLED, "enableInternalAnalytics", "(ZLx70/c;)Ljava/lang/Object;", "isInternalAnalyticsEnabled", "(Lx70/c;)Ljava/lang/Object;", "event", "saveAnalyticsEvent", "(Lzendesk/analyticskit/android/model/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", "getAnalyticsEvents", "analyticsEvents", "removeAnalytics", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "Lzendesk/storage/android/Storage;", "Lv80/x;", "Ln90/c;", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,94:1\n43#2,2:95\n*S KotlinDebug\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage\n*L\n86#1:95,2\n*E\n"})
public final class AnalyticsStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String KEY_ANALYTICS_EVENTS_ID = "AnalyticsStorage.KEY_ANALYTICS_EVENTS_ID";

    @NotNull
    private static final String KEY_INTERNAL_ANALYTICS_ENABLEMENT = "AnalyticsStorage.KEY_INTERNAL_ANALYTICS_ENABLEMENT";

    @NotNull
    private final c json;

    @NotNull
    private final x persistenceDispatcher;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.storage.AnalyticsStorage$enableInternalAnalytics$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.storage.AnalyticsStorage$enableInternalAnalytics$2", f = "AnalyticsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$enableInternalAnalytics$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,94:1\n43#2,2:95\n*S KotlinDebug\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$enableInternalAnalytics$2\n*L\n39#1:95,2\n*E\n"})
    public static final class AnonymousClass2 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ boolean $enabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z11, x70.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$enabled = z11;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsStorage.this.new AnonymousClass2(this.$enabled, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            AnalyticsStorage.this.storage.set(AnalyticsStorage.KEY_INTERNAL_ANALYTICS_ENABLEMENT, Boolean.valueOf(this.$enabled), Boolean.class);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.storage.AnalyticsStorage$getAnalyticsEvents$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.storage.AnalyticsStorage$getAnalyticsEvents$2", f = "AnalyticsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv80/b0;", "", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "<anonymous>", "(Lv80/b0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$getAnalyticsEvents$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,94:1\n20#2,7:95\n*S KotlinDebug\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$getAnalyticsEvents$2\n*L\n62#1:95,7\n*E\n"})
    public static final class C01792 extends i implements Function2<b0, x70.c<? super List<? extends AnalyticsEvent>>, Object> {
        int label;

        public C01792(x70.c<? super C01792> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsStorage.this.new C01792(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super List<AnalyticsEvent>> cVar) {
            return ((C01792) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
                if (r0 != 0) goto L8d
                ba0.g.M(r5)
                zendesk.analyticskit.android.internal.storage.AnalyticsStorage r5 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.this
                zendesk.storage.android.Storage r5 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.access$getStorage$p(r5)
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                java.lang.String r1 = r0.getName()
                int r2 = r1.hashCode()
                java.lang.String r3 = "AnalyticsStorage.KEY_ANALYTICS_EVENTS_ID"
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
                java.lang.String r5 = (java.lang.String) r5
                goto L6a
            L31:
                java.lang.String r2 = "java.lang.Boolean"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3a
                goto L66
            L3a:
                java.lang.Class r0 = java.lang.Boolean.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.String r5 = (java.lang.String) r5
                goto L6a
            L43:
                java.lang.String r2 = "java.lang.Float"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L4c
                goto L66
            L4c:
                java.lang.Class r0 = java.lang.Float.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.String r5 = (java.lang.String) r5
                goto L6a
            L55:
                java.lang.String r2 = "java.lang.Integer"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L66
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.String r5 = (java.lang.String) r5
                goto L6a
            L66:
                java.lang.Object r5 = r5.get(r3, r0)
            L6a:
                java.lang.String r5 = (java.lang.String) r5
                if (r5 == 0) goto L8a
                zendesk.analyticskit.android.internal.storage.AnalyticsStorage r0 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.this
                n90.c r0 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.access$getJson$p(r0)
                zendesk.analyticskit.android.model.AnalyticsEvent$Companion r1 = zendesk.analyticskit.android.model.AnalyticsEvent.INSTANCE
                kotlinx.serialization.KSerializer r1 = r1.serializer()
                r1.getClass()
                m90.d r2 = new m90.d
                r3 = 0
                r2.<init>(r1, r3)
                java.lang.Object r5 = r0.b(r2, r5)
                java.util.List r5 = (java.util.List) r5
                return r5
            L8a:
                kotlin.collections.n0 r5 = kotlin.collections.n0.f26529a
                return r5
            L8d:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.storage.AnalyticsStorage.C01792.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.storage.AnalyticsStorage$isInternalAnalyticsEnabled$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.storage.AnalyticsStorage$isInternalAnalyticsEnabled$2", f = "AnalyticsStorage.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)Z"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$isInternalAnalyticsEnabled$2\n+ 2 StorageKtx.kt\nzendesk/storage/android/StorageKtxKt\n*L\n1#1,94:1\n20#2,7:95\n*S KotlinDebug\n*F\n+ 1 AnalyticsStorage.kt\nzendesk/analyticskit/android/internal/storage/AnalyticsStorage$isInternalAnalyticsEnabled$2\n*L\n50#1:95,7\n*E\n"})
    public static final class C01802 extends i implements Function2<b0, x70.c<? super Boolean>, Object> {
        int label;

        public C01802(x70.c<? super C01802> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsStorage.this.new C01802(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Boolean> cVar) {
            return ((C01802) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
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
                zendesk.analyticskit.android.internal.storage.AnalyticsStorage r5 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.this
                zendesk.storage.android.Storage r5 = zendesk.analyticskit.android.internal.storage.AnalyticsStorage.access$getStorage$p(r5)
                java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
                java.lang.String r1 = r0.getName()
                int r2 = r1.hashCode()
                java.lang.String r3 = "AnalyticsStorage.KEY_INTERNAL_ANALYTICS_ENABLEMENT"
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
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                goto L6a
            L31:
                java.lang.String r2 = "java.lang.Boolean"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L3a
                goto L66
            L3a:
                java.lang.Class r0 = java.lang.Boolean.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                goto L6a
            L43:
                java.lang.String r2 = "java.lang.Float"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L4c
                goto L66
            L4c:
                java.lang.Class r0 = java.lang.Float.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                goto L6a
            L55:
                java.lang.String r2 = "java.lang.Integer"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L66
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.Object r5 = r5.get(r3, r0)
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                goto L6a
            L66:
                java.lang.Object r5 = r5.get(r3, r0)
            L6a:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                if (r5 == 0) goto L73
                boolean r5 = r5.booleanValue()
                goto L74
            L73:
                r5 = 1
            L74:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                return r5
            L79:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r5)
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.storage.AnalyticsStorage.C01802.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.storage.AnalyticsStorage$removeAnalytics$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.storage.AnalyticsStorage$removeAnalytics$2", f = "AnalyticsStorage.kt", l = {72}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01812 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ List<AnalyticsEvent> $analyticsEvents;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01812(List<AnalyticsEvent> list, x70.c<? super C01812> cVar) {
            super(2, cVar);
            this.$analyticsEvents = list;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsStorage.this.new C01812(this.$analyticsEvents, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C01812) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AnalyticsStorage analyticsStorage = AnalyticsStorage.this;
                this.label = 1;
                obj = analyticsStorage.getAnalyticsEvents(this);
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
            AnalyticsStorage.this.saveAnalyticsEvents(CollectionsKt.a0(CollectionsKt.v0(this.$analyticsEvents), (List) obj));
            return Unit.f26487a;
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.storage.AnalyticsStorage$saveAnalyticsEvent$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.storage.AnalyticsStorage$saveAnalyticsEvent$2", f = "AnalyticsStorage.kt", l = {55}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class C01822 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ AnalyticsEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01822(AnalyticsEvent analyticsEvent, x70.c<? super C01822> cVar) {
            super(2, cVar);
            this.$event = analyticsEvent;
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsStorage.this.new C01822(this.$event, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C01822) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                AnalyticsStorage analyticsStorage = AnalyticsStorage.this;
                this.label = 1;
                obj = analyticsStorage.getAnalyticsEvents(this);
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
            AnalyticsStorage.this.saveAnalyticsEvents(CollectionsKt.e0((List) obj, this.$event));
            return Unit.f26487a;
        }
    }

    public AnalyticsStorage(@NotNull Storage storage, @NotNull x xVar, @NotNull c cVar) {
        storage.getClass();
        xVar.getClass();
        cVar.getClass();
        this.storage = storage;
        this.persistenceDispatcher = xVar;
        this.json = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(h hVar) {
        hVar.getClass();
        hVar.f30766c = true;
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAnalyticsEvents(List<AnalyticsEvent> updatedEvents) {
        c cVar = this.json;
        KSerializer kSerializerSerializer = AnalyticsEvent.INSTANCE.serializer();
        kSerializerSerializer.getClass();
        this.storage.set(KEY_ANALYTICS_EVENTS_ID, cVar.c(new d(kSerializerSerializer, 0), updatedEvents), String.class);
    }

    @Nullable
    public final Object enableInternalAnalytics(boolean z11, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new AnonymousClass2(z11, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object getAnalyticsEvents(@NotNull x70.c<? super List<AnalyticsEvent>> cVar) {
        return f0.K(this.persistenceDispatcher, new C01792(null), cVar);
    }

    @Nullable
    public final Object isInternalAnalyticsEnabled(@NotNull x70.c<? super Boolean> cVar) {
        return f0.K(this.persistenceDispatcher, new C01802(null), cVar);
    }

    @Nullable
    public final Object removeAnalytics(@NotNull List<AnalyticsEvent> list, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C01812(list, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    @Nullable
    public final Object saveAnalyticsEvent(@NotNull AnalyticsEvent analyticsEvent, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        Object objK = f0.K(this.persistenceDispatcher, new C01822(analyticsEvent, null), cVar);
        return objK == a.COROUTINE_SUSPENDED ? objK : Unit.f26487a;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lzendesk/analyticskit/android/internal/storage/AnalyticsStorage$Companion;", "", "<init>", "()V", "KEY_ANALYTICS_EVENTS_ID", "", "KEY_INTERNAL_ANALYTICS_ENABLEMENT", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnalyticsStorage(Storage storage, x xVar, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, xVar, (i11 & 4) != 0 ? w.h(new m(15)) : cVar);
    }
}

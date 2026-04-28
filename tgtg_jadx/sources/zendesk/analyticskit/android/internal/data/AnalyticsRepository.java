package zendesk.analyticskit.android.internal.data;

import com.braze.models.FeatureFlag;
import e90.a;
import e90.d;
import j4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.x;
import z70.c;
import z70.e;
import z70.i;
import zendesk.analyticskit.android.internal.model.AnalyticsEventDto;
import zendesk.analyticskit.android.internal.model.AnalyticsEventsDto;
import zendesk.analyticskit.android.internal.model.AnalyticsEventsDtoKt;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorage;
import zendesk.analyticskit.android.model.AnalyticsSettings;
import zendesk.android.internal.frontendevents.FrontendEventsStorage;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 42\u00020\u0001:\u00014B3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0011H\u0086@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010/\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lzendesk/analyticskit/android/internal/data/AnalyticsRepository;", "", "Lzendesk/analyticskit/android/model/AnalyticsSettings;", "analyticsSettings", "Lzendesk/analyticskit/android/internal/data/AnalyticsService;", "analyticsService", "Lzendesk/analyticskit/android/internal/storage/AnalyticsStorage;", "analyticsStorage", "Lv80/b0;", "coroutineScope", "Lv80/x;", "ioDispatcher", "<init>", "(Lzendesk/analyticskit/android/model/AnalyticsSettings;Lzendesk/analyticskit/android/internal/data/AnalyticsService;Lzendesk/analyticskit/android/internal/storage/AnalyticsStorage;Lv80/b0;Lv80/x;)V", "", "Lzendesk/analyticskit/android/model/AnalyticsEvent;", "analyticsEvents", "", "shouldProcessAllEvents", "", "processAnalyticsEvents", "(Ljava/util/List;ZLx70/c;)Ljava/lang/Object;", "Lzendesk/analyticskit/android/internal/model/AnalyticsEventsDto;", "analyticsEventsDto", "removeAnalyticsEvents", "(Lzendesk/analyticskit/android/internal/model/AnalyticsEventsDto;Lx70/c;)Ljava/lang/Object;", "Lu70/q;", "sendAnalyticsEvents-gIAlu-s", "sendAnalyticsEvents", "analyticsEvent", "process", "(Lzendesk/analyticskit/android/model/AnalyticsEvent;Lx70/c;)Ljava/lang/Object;", FeatureFlag.ENABLED, "enableInternalAnalytics", "(ZLx70/c;)Ljava/lang/Object;", "isInternalAnalyticsEnabled", "(Lx70/c;)Ljava/lang/Object;", "", "getCurrentSessionId", "()Ljava/lang/String;", "processAllAnalyticsEvents", "()V", "Lzendesk/analyticskit/android/model/AnalyticsSettings;", "Lzendesk/analyticskit/android/internal/data/AnalyticsService;", "Lzendesk/analyticskit/android/internal/storage/AnalyticsStorage;", "Lv80/b0;", "Lv80/x;", FrontendEventsStorage.KEY_SUID, "Ljava/lang/String;", "Le90/a;", "mutex", "Le90/a;", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRepository.kt\nzendesk/analyticskit/android/internal/data/AnalyticsRepository\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,172:1\n116#2,11:173\n116#2,11:184\n116#2,10:195\n1563#3:205\n1634#3,3:206\n774#3:209\n865#3,2:210\n1869#3,2:212\n1563#3:214\n1634#3,3:215\n*S KotlinDebug\n*F\n+ 1 AnalyticsRepository.kt\nzendesk/analyticskit/android/internal/data/AnalyticsRepository\n*L\n56#1:173,11\n73#1:184,11\n84#1:195,10\n123#1:205\n123#1:206,3\n124#1:209\n124#1:210,2\n125#1:212,2\n143#1:214\n143#1:215,3\n*E\n"})
public final class AnalyticsRepository {

    @NotNull
    private static final String LOG_TAG = "AnalyticsRepository";

    @NotNull
    private final AnalyticsService analyticsService;

    @NotNull
    private final AnalyticsSettings analyticsSettings;

    @NotNull
    private final AnalyticsStorage analyticsStorage;

    @NotNull
    private final b0 coroutineScope;

    @NotNull
    private final x ioDispatcher;

    @NotNull
    private final a mutex;

    @NotNull
    private final String suid;

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.data.AnalyticsRepository$enableInternalAnalytics$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {178, 74}, m = "enableInternalAnalytics")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsRepository.this.enableInternalAnalytics(false, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.data.AnalyticsRepository$isInternalAnalyticsEnabled$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {178, 85}, m = "isInternalAnalyticsEnabled")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01751 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C01751(x70.c<? super C01751> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsRepository.this.isInternalAnalyticsEnabled(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.data.AnalyticsRepository$process$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {178, 57, 58, 60}, m = "process")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01761 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01761(x70.c<? super C01761> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsRepository.this.process(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.data.AnalyticsRepository$processAllAnalyticsEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository$processAllAnalyticsEvents$1", f = "AnalyticsRepository.kt", l = {178, 102, 103}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension({"SMAP\nAnalyticsRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRepository.kt\nzendesk/analyticskit/android/internal/data/AnalyticsRepository$processAllAnalyticsEvents$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,172:1\n116#2,11:173\n*S KotlinDebug\n*F\n+ 1 AnalyticsRepository.kt\nzendesk/analyticskit/android/internal/data/AnalyticsRepository$processAllAnalyticsEvents$1\n*L\n101#1:173,11\n*E\n"})
    public static final class C01771 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C01771(x70.c<? super C01771> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final x70.c<Unit> create(Object obj, x70.c<?> cVar) {
            return AnalyticsRepository.this.new C01771(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, x70.c<? super Unit> cVar) {
            return ((C01771) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
        @Override // z70.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                y70.a r0 = y70.a.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L3e
                if (r1 == r4) goto L31
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r8.L$0
                e90.a r0 = (e90.a) r0
                ba0.g.M(r9)     // Catch: java.lang.Throwable -> L18
                goto L7a
            L18:
                r9 = move-exception
                goto L84
            L1b:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                com.braze.h2.b(r9)
                r9 = 0
                return r9
            L22:
                java.lang.Object r1 = r8.L$1
                zendesk.analyticskit.android.internal.data.AnalyticsRepository r1 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository) r1
                java.lang.Object r3 = r8.L$0
                e90.a r3 = (e90.a) r3
                ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2e
                goto L6a
            L2e:
                r9 = move-exception
                r0 = r3
                goto L84
            L31:
                java.lang.Object r1 = r8.L$1
                zendesk.analyticskit.android.internal.data.AnalyticsRepository r1 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository) r1
                java.lang.Object r6 = r8.L$0
                e90.a r6 = (e90.a) r6
                ba0.g.M(r9)
                r9 = r6
                goto L56
            L3e:
                ba0.g.M(r9)
                zendesk.analyticskit.android.internal.data.AnalyticsRepository r9 = zendesk.analyticskit.android.internal.data.AnalyticsRepository.this
                e90.a r9 = zendesk.analyticskit.android.internal.data.AnalyticsRepository.access$getMutex$p(r9)
                zendesk.analyticskit.android.internal.data.AnalyticsRepository r1 = zendesk.analyticskit.android.internal.data.AnalyticsRepository.this
                r8.L$0 = r9
                r8.L$1 = r1
                r8.label = r4
                java.lang.Object r6 = r9.g(r8)
                if (r6 != r0) goto L56
                goto L78
            L56:
                zendesk.analyticskit.android.internal.storage.AnalyticsStorage r6 = zendesk.analyticskit.android.internal.data.AnalyticsRepository.access$getAnalyticsStorage$p(r1)     // Catch: java.lang.Throwable -> L80
                r8.L$0 = r9     // Catch: java.lang.Throwable -> L80
                r8.L$1 = r1     // Catch: java.lang.Throwable -> L80
                r8.label = r3     // Catch: java.lang.Throwable -> L80
                java.lang.Object r3 = r6.getAnalyticsEvents(r8)     // Catch: java.lang.Throwable -> L80
                if (r3 != r0) goto L67
                goto L78
            L67:
                r7 = r3
                r3 = r9
                r9 = r7
            L6a:
                java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L2e
                r8.L$0 = r3     // Catch: java.lang.Throwable -> L2e
                r8.L$1 = r5     // Catch: java.lang.Throwable -> L2e
                r8.label = r2     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r9 = zendesk.analyticskit.android.internal.data.AnalyticsRepository.access$processAnalyticsEvents(r1, r9, r4, r8)     // Catch: java.lang.Throwable -> L2e
                if (r9 != r0) goto L79
            L78:
                return r0
            L79:
                r0 = r3
            L7a:
                r0.e(r5)
                kotlin.Unit r9 = kotlin.Unit.f26487a
                return r9
            L80:
                r0 = move-exception
                r7 = r0
                r0 = r9
                r9 = r7
            L84:
                r0.e(r5)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.C01771.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: zendesk.analyticskit.android.internal.data.AnalyticsRepository$processAnalyticsEvents$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.analyticskit.android.internal.data.AnalyticsRepository", f = "AnalyticsRepository.kt", l = {126, 128}, m = "processAnalyticsEvents")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01781 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01781(x70.c<? super C01781> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AnalyticsRepository.this.processAnalyticsEvents(null, false, this);
        }
    }

    public AnalyticsRepository(@NotNull AnalyticsSettings analyticsSettings, @NotNull AnalyticsService analyticsService, @NotNull AnalyticsStorage analyticsStorage, @NotNull b0 b0Var, @NotNull x xVar) {
        analyticsSettings.getClass();
        analyticsService.getClass();
        analyticsStorage.getClass();
        b0Var.getClass();
        xVar.getClass();
        this.analyticsSettings = analyticsSettings;
        this.analyticsService = analyticsService;
        this.analyticsStorage = analyticsStorage;
        this.coroutineScope = b0Var;
        this.ioDispatcher = xVar;
        this.suid = s.e();
        this.mutex = d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if (removeAnalyticsEvents((zendesk.analyticskit.android.internal.model.AnalyticsEventsDto) r12, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e1 -> B:43:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:43:0x00f3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processAnalyticsEvents(java.util.List<zendesk.analyticskit.android.model.AnalyticsEvent> r12, boolean r13, x70.c<? super kotlin.Unit> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.processAnalyticsEvents(java.util.List, boolean, x70.c):java.lang.Object");
    }

    public static /* synthetic */ Object processAnalyticsEvents$default(AnalyticsRepository analyticsRepository, List list, boolean z11, x70.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return analyticsRepository.processAnalyticsEvents(list, z11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object removeAnalyticsEvents(AnalyticsEventsDto analyticsEventsDto, x70.c<? super Unit> cVar) throws Throwable {
        List<AnalyticsEventDto> events = analyticsEventsDto.getEvents();
        ArrayList arrayList = new ArrayList(e0.o(events, 10));
        Iterator<T> it = events.iterator();
        while (it.hasNext()) {
            arrayList.add(AnalyticsEventsDtoKt.toDomain((AnalyticsEventDto) it.next()));
        }
        Object objRemoveAnalytics = this.analyticsStorage.removeAnalytics(arrayList, cVar);
        return objRemoveAnalytics == y70.a.COROUTINE_SUSPENDED ? objRemoveAnalytics : Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: sendAnalyticsEvents-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m990sendAnalyticsEventsgIAlus(zendesk.analyticskit.android.internal.model.AnalyticsEventsDto r6, x70.c<? super u70.q<zendesk.analyticskit.android.internal.model.AnalyticsEventsDto>> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$1 r0 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$1 r0 = new zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r7)
            goto L42
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L2e:
            ba0.g.M(r7)
            v80.x r7 = r5.ioDispatcher
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$2 r2 = new zendesk.analyticskit.android.internal.data.AnalyticsRepository$sendAnalyticsEvents$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = v80.f0.K(r7, r2, r0)
            if (r7 != r1) goto L42
            return r1
        L42:
            u70.q r7 = (u70.q) r7
            java.lang.Object r6 = r7.f40851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.m990sendAnalyticsEventsgIAlus(zendesk.analyticskit.android.internal.model.AnalyticsEventsDto, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object enableInternalAnalytics(boolean r8, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof zendesk.analyticskit.android.internal.data.AnalyticsRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$enableInternalAnalytics$1 r0 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$enableInternalAnalytics$1 r0 = new zendesk.analyticskit.android.internal.data.AnalyticsRepository$enableInternalAnalytics$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.L$0
            e90.a r8 = (e90.a) r8
            ba0.g.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L63
        L2f:
            r9 = move-exception
            goto L6d
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            boolean r8 = r0.Z$0
            java.lang.Object r2 = r0.L$0
            e90.a r2 = (e90.a) r2
            ba0.g.M(r9)
            r9 = r2
            goto L55
        L43:
            ba0.g.M(r9)
            e90.a r9 = r7.mutex
            r0.L$0 = r9
            r0.Z$0 = r8
            r0.label = r4
            java.lang.Object r2 = r9.g(r0)
            if (r2 != r1) goto L55
            goto L61
        L55:
            zendesk.analyticskit.android.internal.storage.AnalyticsStorage r2 = r7.analyticsStorage     // Catch: java.lang.Throwable -> L69
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L69
            r0.label = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r8 = r2.enableInternalAnalytics(r8, r0)     // Catch: java.lang.Throwable -> L69
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            r8 = r9
        L63:
            r8.e(r5)
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L69:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L6d:
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.enableInternalAnalytics(boolean, x70.c):java.lang.Object");
    }

    @NotNull
    /* JADX INFO: renamed from: getCurrentSessionId, reason: from getter */
    public final String getSuid() {
        return this.suid;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isInternalAnalyticsEnabled(@org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof zendesk.analyticskit.android.internal.data.AnalyticsRepository.C01751
            if (r0 == 0) goto L13
            r0 = r8
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$isInternalAnalyticsEnabled$1 r0 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository.C01751) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$isInternalAnalyticsEnabled$1 r0 = new zendesk.analyticskit.android.internal.data.AnalyticsRepository$isInternalAnalyticsEnabled$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L38
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.L$0
            e90.a r0 = (e90.a) r0
            ba0.g.M(r8)     // Catch: java.lang.Throwable -> L2f
            goto L61
        L2f:
            r8 = move-exception
            goto L69
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L38:
            java.lang.Object r2 = r0.L$0
            e90.a r2 = (e90.a) r2
            ba0.g.M(r8)
            r8 = r2
            goto L51
        L41:
            ba0.g.M(r8)
            e90.a r8 = r7.mutex
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r2 = r8.g(r0)
            if (r2 != r1) goto L51
            goto L5d
        L51:
            zendesk.analyticskit.android.internal.storage.AnalyticsStorage r2 = r7.analyticsStorage     // Catch: java.lang.Throwable -> L65
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L65
            r0.label = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r2.isInternalAnalyticsEnabled(r0)     // Catch: java.lang.Throwable -> L65
            if (r0 != r1) goto L5e
        L5d:
            return r1
        L5e:
            r6 = r0
            r0 = r8
            r8 = r6
        L61:
            r0.e(r5)
            return r8
        L65:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L69:
            r0.e(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.isInternalAnalyticsEnabled(x70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (processAnalyticsEvents$default(r9, (java.util.List) r11, false, r4, 2, null) != r0) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090 A[Catch: all -> 0x0038, PHI: r10 r11
      0x0090: PHI (r10v8 e90.a) = (r10v7 e90.a), (r10v17 e90.a) binds: [B:37:0x008d, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v1 java.lang.Object) binds: [B:37:0x008d, B:23:0x0047] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0038, blocks: (B:16:0x0033, B:23:0x0047, B:39:0x0090, B:26:0x004f, B:36:0x0083), top: B:50:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r10v1, types: [e90.a] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object process(@org.jetbrains.annotations.NotNull zendesk.analyticskit.android.model.AnalyticsEvent r10, @org.jetbrains.annotations.NotNull x70.c<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof zendesk.analyticskit.android.internal.data.AnalyticsRepository.C01761
            if (r0 == 0) goto L14
            r0 = r11
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$process$1 r0 = (zendesk.analyticskit.android.internal.data.AnalyticsRepository.C01761) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            zendesk.analyticskit.android.internal.data.AnalyticsRepository$process$1 r0 = new zendesk.analyticskit.android.internal.data.AnalyticsRepository$process$1
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r4.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 4
            r3 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L61
            if (r1 == r6) goto L53
            if (r1 == r5) goto L4b
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3c
            java.lang.Object r10 = r4.L$0
            e90.a r10 = (e90.a) r10
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L38
            goto La2
        L38:
            r0 = move-exception
            r11 = r0
            goto Lad
        L3c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r10)
            r10 = 0
            return r10
        L43:
            java.lang.Object r10 = r4.L$0
            e90.a r10 = (e90.a) r10
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L38
            goto L90
        L4b:
            java.lang.Object r10 = r4.L$0
            e90.a r10 = (e90.a) r10
            ba0.g.M(r11)     // Catch: java.lang.Throwable -> L38
            goto L83
        L53:
            java.lang.Object r10 = r4.L$1
            e90.a r10 = (e90.a) r10
            java.lang.Object r1 = r4.L$0
            zendesk.analyticskit.android.model.AnalyticsEvent r1 = (zendesk.analyticskit.android.model.AnalyticsEvent) r1
            ba0.g.M(r11)
            r11 = r10
            r10 = r1
            goto L73
        L61:
            ba0.g.M(r11)
            e90.a r11 = r9.mutex
            r4.L$0 = r10
            r4.L$1 = r11
            r4.label = r6
            java.lang.Object r1 = r11.g(r4)
            if (r1 != r0) goto L73
            goto La1
        L73:
            zendesk.analyticskit.android.internal.storage.AnalyticsStorage r1 = r9.analyticsStorage     // Catch: java.lang.Throwable -> La8
            r4.L$0 = r11     // Catch: java.lang.Throwable -> La8
            r4.L$1 = r7     // Catch: java.lang.Throwable -> La8
            r4.label = r5     // Catch: java.lang.Throwable -> La8
            java.lang.Object r10 = r1.saveAnalyticsEvent(r10, r4)     // Catch: java.lang.Throwable -> La8
            if (r10 != r0) goto L82
            goto La1
        L82:
            r10 = r11
        L83:
            zendesk.analyticskit.android.internal.storage.AnalyticsStorage r11 = r9.analyticsStorage     // Catch: java.lang.Throwable -> L38
            r4.L$0 = r10     // Catch: java.lang.Throwable -> L38
            r4.label = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r11 = r11.getAnalyticsEvents(r4)     // Catch: java.lang.Throwable -> L38
            if (r11 != r0) goto L90
            goto La1
        L90:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L38
            r4.L$0 = r10     // Catch: java.lang.Throwable -> L38
            r4.label = r2     // Catch: java.lang.Throwable -> L38
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r9
            r2 = r11
            java.lang.Object r11 = processAnalyticsEvents$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L38
            if (r11 != r0) goto La2
        La1:
            return r0
        La2:
            r10.e(r7)
            kotlin.Unit r10 = kotlin.Unit.f26487a
            return r10
        La8:
            r0 = move-exception
            r10 = r0
            r8 = r11
            r11 = r10
            r10 = r8
        Lad:
            r10.e(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.analyticskit.android.internal.data.AnalyticsRepository.process(zendesk.analyticskit.android.model.AnalyticsEvent, x70.c):java.lang.Object");
    }

    public final void processAllAnalyticsEvents() {
        f0.B(this.coroutineScope, null, null, new C01771(null), 3);
    }
}

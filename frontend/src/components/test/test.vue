<template>
    <div class="test">
        <time-selector style="float: right"></time-selector>
        <!--<iframe src="#/f5/requestClientTop20Visualize" width="600" height="400"></iframe>
        <iframe src="http://35.10.28.157:5601/app/kibana#/visualize/edit/AV_mWT9NtzVZhbjXBKMJ?embed=true&_g=(refreshInterval%3A(pause%3A!t%2Cvalue%3A0)%2Ctime%3A(from%3Anow-30m%2Cmode%3Aquick%2Cto%3Anow))"
                height="400" width="600"></iframe>
        <iframe src="#/f5/realtimeHttpResponseCodeVisualize" width="600" height="400"></iframe>
        <iframe src="#/f5/realtimeServerResponseDelayVisualize" width="600" height="400"></iframe>-->
        <!--<iframe src="http://35.10.28.157:5601/app/kibana#/dashboard/Metricbeat-system-overview?embed=true&_g=(refreshInterval%3A(pause%3A!f%2Cvalue%3A10000)%2Ctime%3A(from%3Anow-15m%2Cmode%3Aquick%2Cto%3Anow))"
                height="100%" width="100%"></iframe>-->
    </div>
</template>
<script>
    import TimeSelector from '@/base/time-selector/time-selector'

    export default {
        components: {
            TimeSelector
        }
    }
</script>
<style scoped lang="less">
    .test {
        height: 100%;
        overflow-y: scroll;
    }
</style>

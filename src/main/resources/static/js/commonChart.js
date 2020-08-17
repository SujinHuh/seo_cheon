
function maxValue(data){

    var getMax = function(v){
        var res = v.success;
        if(v.success < v.fail) {
            res = v.fail;
        }
        return res;
    }

    var maxValue = 5;
    $.each(data, function(i, v){

        var  rowMax = getMax(v);
        if(maxValue < rowMax) {
            maxValue = rowMax;
        }
    });

    var setp = (maxValue+'').length;
    var unit = Math.pow(10, Number(setp)-1);

    if(maxValue % unit != 0){
        maxValue = maxValue - (maxValue % unit) + Number(unit);
    }
    return maxValue;
}

function getStepSize(max) {
    var stepSize = 5;

    if( max/10 == 0){
        stepSize = 1;
    }
    if( (max /10)  >= 1){
        stepSize = 2;
    }

    if( (max /10) >= 2){
        stepSize = 5;
    }

    if( (max /10) >= 4){
        stepSize = 50;
    }

    if( (max /10) >= 5){
        stepSize = 100;
    }

    return stepSize;
}


function getUnit(selectedRange) {
    return selectedRange == 'time' ? 'hour' : 'day';
}

function getFormat(selectedRange) {
    return selectedRange == 'time' ? 'HH:mm' : 'MM/DD';
}

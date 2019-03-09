function changeValueOfRange(i) {
    let rangeValueLabel = document.getElementById('rangeValueLabel' + i);
    rangeValueLabel.innerText = document.getElementById('range' + i).value;
}
